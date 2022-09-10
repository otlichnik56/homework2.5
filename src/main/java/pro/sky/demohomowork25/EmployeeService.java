package pro.sky.demohomowork25;

import org.springframework.stereotype.Service;

import java.util.*;

import static sun.tools.jstat.Alignment.keySet;
// сервис
@Service
public class EmployeeService implements EmployeeServiceImp {
    private  final Map<String, Employee> employers = new HashMap<>(Map.of(
            "123",
            new Employee("Иванов", "Иван"),
            "456",
            new Employee("Иванов1", "Иван1"),
            "789",
            new Employee("Иванов2", "Иван2"),
            "147",
            new Employee("Иванов3", "Иван3"),
            "258",
            new Employee("Иванов4", "Иван4"),
            "369",
            new Employee("Иванов5", "Иван5"),
            "159",
            new Employee("Иванов6", "Иван6")
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
            employers.remove(keySet().toString(), employee1);
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

}
