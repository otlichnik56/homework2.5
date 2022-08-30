package pro.sky.demohomowork25;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/employee")
    public String getPerson(@RequestParam("number") Integer number) {
        final String person;
        person = employeeService.getEmployee(number);
        return person;
    }

    @GetMapping (path = "/employee/add")
    public String addPerson(@RequestParam("firstName") String firstName,
                            @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeService.addEmployee(employee);
        return "Сотрудник успешно добавлен";
    }

    @GetMapping(path = "/employee/remove")
    public String removePerson(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeService.removeEmployee(employee);
        return "Сотрудник удален";
    }

    @GetMapping(path = "employee/find")
    public String findPerson(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return "Сотрудник - " + employeeService.findEmployee(employee);
    }
}
