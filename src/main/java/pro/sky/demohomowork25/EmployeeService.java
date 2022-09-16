package pro.sky.demohomowork25;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
// сервис1

@Service
public class EmployeeService implements EmployeeServiceImp {
    private static int countId = 0;
    private  final Map<Integer, Employee> employers = new HashMap<>(Map.of());

    @Override
    public Map<Integer, Employee> getEmployers(){
        return employers;
    }

    @Override
    public void addEmployee(Employee employee1) {
        for (Employee employee: employers.values()) {
            if (employee1.equals(employee)){
                throw new EmployeeAlreadyAddedException("Сотрудник с таким именем и фамилей уже существует");
            }
        }
        countId ++;
        employers.put(countId, employee1);
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
    public List<Employee> getAllEmployeeOfDepartment(int departmentId) {
        return getEmployers().values().stream()
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
