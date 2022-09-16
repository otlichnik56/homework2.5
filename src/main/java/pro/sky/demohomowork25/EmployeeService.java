package pro.sky.demohomowork25;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
// сервис1

@Service
public class EmployeeService implements EmployeeServiceImp {
    private  final Map<String, Employee> employers = new HashMap<>(Map.of());

    @Override
    public Map<String, Employee> getEmployers(){
        return employers;
    }

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

}
