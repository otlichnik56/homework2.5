package pro.sky.demohomowork25;

import java.util.Map;

public interface EmployeeService {
    void addEmployee(Employee employee1);

    void removeEmployee(Employee employee1);

    String findEmployee(Employee employee1);

    Map<Integer, Employee> getAllEmployee();
}
