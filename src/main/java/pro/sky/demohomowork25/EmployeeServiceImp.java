package pro.sky.demohomowork25;

import java.util.List;
import java.util.Map;

public interface EmployeeServiceImp {

    Map<String, Employee> getEmployers();

    void addEmployee(Employee employee1);

    void removeEmployee(Employee employee1);

    String findEmployee(Employee employee1);

}
