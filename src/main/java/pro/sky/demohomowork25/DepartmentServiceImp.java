package pro.sky.demohomowork25;

import java.util.List;
import java.util.Map;

public interface DepartmentServiceImp {
    Map<String, Employee> getAllEmployee();

    List<Employee> getAllEmployeeOfDepartment(int departmentId);

    Employee maxSalaryOfDepartment(int departmentId);

    Employee minSalaryOfDepartment(int departmentId);
}
