package pro.sky.demohomowork25;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceImp {
    private  final Map<String, Employee> employers = new HashMap<>(Map.of(
            "123",
            new Employee("Иванов", "Иван", 50000, 3),
            "456",
            new Employee("Иванов1", "Иван1", 500200, 3),
            "789",
            new Employee("Иванов2", "Иван2", 501000, 1),
            "147",
            new Employee("Иванов3", "Иван3", 507000, 2),
            "258",
            new Employee("Иванов4", "Иван4", 550000, 2),
            "369",
            new Employee("Иванов5", "Иван5", 530000, 3),
            "159",
            new Employee("Иванов6", "Иван6", 503000, 3)
    ));

    @Override
    public void addEmployee(Employee employee1) {
        for (Employee employee: employers.values()) {
            if (employee1.equals(employee)){
                throw new EmployeeAlreadyAddedException("Сотрудник с таким именем и фамилей уже существует");
            }
        }
        Random rand = new Random();
        employers.put(rand.toString(), employee1);
    }

    @Override
    public void removeEmployee(Employee employee1) {
        if (employers.containsValue(employee1)) {
            employers.remove(employee1);
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public String findEmployee(Employee employee1) {
        if (employers.containsValue(employee1)) {
            return "найден - " + employee1;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public Map<String, Employee> getAllEmployee() {
        return employers;
    }

    @Override
    public List<Employee> getAllEmployeeOfDepartment(int departmentId) {
        return employers.values().stream()
                .filter(e -> e.getDepId() == departmentId)
                .collect(Collectors.toList());
    }
    @Override
    public Employee maxSalaryOfDepartment(int departmentId) {
        List<Employee> results = getAllEmployeeOfDepartment(departmentId);
        return results.stream().max(Employee::compare).get();
    }

    @Override
    public Employee minSalaryOfDepartment(int departmentId) {
        List<Employee> results = getAllEmployeeOfDepartment(departmentId);
        return results.stream().min(Employee::compare).get();
    }

}
