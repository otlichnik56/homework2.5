package pro.sky.demohomowork25;

import java.util.List;
import java.util.Map;

public interface EmployeeServiceImp {

    void addEmployee(Employee employee1);

    void removeEmployee(Employee employee1);

    String findEmployee(Employee employee1);

    Map<Integer, Employee> getAllEmployee();

    List<Employee> getAllEmployeeOfDepartment(int departmentId);

    Employee maxSalaryOfDepartment(int departmentId);

    Employee minSalaryOfDepartment(int departmentId);
}
