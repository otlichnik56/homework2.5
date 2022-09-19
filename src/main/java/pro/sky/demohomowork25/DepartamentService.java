package pro.sky.demohomowork25;

import java.util.List;

public interface DepartamentService {
    List<Employee> getAllEmployeeOfDepartment(int departmentId);

    Employee maxSalaryOfDepartment(int departmentId);

    Employee minSalaryOfDepartment(int departmentId);
}
