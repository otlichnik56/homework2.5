package pro.sky.demohomowork25;

import java.util.List;
import java.util.Map;

public interface EmployeeServiceImp {

    Map<Integer, Employee> getEmployers();

    void addEmployee(Employee employee1);

    void removeEmployee(Employee employee1);

    String findEmployee(Employee employee1);

    List<Employee> getAllEmployeeOfDepartment(int departmentId);

    Employee maxSalaryOfDepartment(int departmentId);

    Employee minSalaryOfDepartment(int departmentId);

}
