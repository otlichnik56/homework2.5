package pro.sky.demohomowork25;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceImp {
    private  final List<Employee> employers = new ArrayList<>(List.of(
            new Employee("Иванов", "Иван"),
            new Employee("Иванов1", "Иван1"),
            new Employee("Иванов2", "Иван2"),
            new Employee("Иванов3", "Иван3"),
            new Employee("Иванов4", "Иван4"),
            new Employee("Иванов5", "Иван5"),
            new Employee("Иванов6", "Иван6")
    ));
    @Override
    public String getEmployee(Integer number){
        final Employee employee;
        if (number >= employers.size()){
            throw new EmployeeStorageIsFullException("В массиве не существует такого номера элемента");
        }
        employee = employers.get(number);
        return " " + employee.getFirstName() + " " + employee.getLastName();
    }

    @Override
    public void addEmployee(Employee employee1) {
        for (Employee employee: employers) {
            if (employee1.equals(employee)){
                throw new EmployeeAlreadyAddedException("Сотрудник с таким именем и фамилей уже существует");
            }
        }
        employers.add(employee1);
    }
    @Override
    public void removeEmployee(Employee employee1) {
        for (Employee employee: employers) {
            if (employee.equals(employee1)) {
                employers.remove(employee1);
                break;
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public String findEmployee(Employee employee1) {
        for (Employee employee: employers) {
            if (employee.equals(employee1)) {
                return "найден";
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

}
