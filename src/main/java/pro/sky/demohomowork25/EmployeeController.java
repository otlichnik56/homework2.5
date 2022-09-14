package pro.sky.demohomowork25;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    public EmployeeController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @GetMapping (path = "/employee/add")
    public String addPerson(@RequestParam("firstName") String firstName,
                            @RequestParam("lastName") String lastName,
                            @RequestParam("salary") int salary,
                            @RequestParam("depId") int depId) {
        Employee employee = new Employee(firstName, lastName, salary, depId);
        employeeService.addEmployee(employee);
        return "Сотрудник успешно добавлен";
    }

    @GetMapping(path = "/employee/remove")
    public String removePerson(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("salary") int salary,
                               @RequestParam("depId") int depId) {
        Employee employee = new Employee(firstName, lastName, salary, depId);
        employeeService.removeEmployee(employee);
        return "Сотрудник удален";
    }

    @GetMapping(path = "employee/find")
    public String findPerson(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("salary") int salary,
                             @RequestParam("depId") int depId) {
        Employee employee = new Employee(firstName, lastName, salary, depId);
        return "Сотрудник - " + employeeService.findEmployee(employee);
    }

    @GetMapping(path = "/departments/al")
    public Map<String, Employee> allEmployee() {
        return departmentService.getAllEmployee();
    }

    @GetMapping(path = "/departments/all")
    public List<Employee> allEmployeeOfDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.getAllEmployeeOfDepartment(departmentId);
    }

    @GetMapping(path = "/departments/max-salary")
    public Employee maxSalaryOfDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.maxSalaryOfDepartment(departmentId);
    }

    @GetMapping(path = "/departments/min-salary")
    public Employee minSalaryOfDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.minSalaryOfDepartment(departmentId);
    }

}
