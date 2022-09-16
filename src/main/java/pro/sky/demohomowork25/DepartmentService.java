package pro.sky.demohomowork25;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// сервис 2

public class DepartmentService extends EmployeeService implements DepartmentServiceImp {

    @Override
    public Map<String, Employee> getAllEmployee() {
        return getEmployers();
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
