package pro.sky.demohomowork25;

import java.util.List;
import java.util.stream.Collectors;

public class DepartamentServiceImpl implements DepartamentService{

    private final EmployeeService employeeService;

    public DepartamentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<Employee> getAllEmployeeOfDepartment(int departmentId) {
        return employeeService.getAllEmployee().values().stream()
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
