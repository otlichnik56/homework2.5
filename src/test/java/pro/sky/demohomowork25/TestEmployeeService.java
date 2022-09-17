package pro.sky.demohomowork25;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestEmployeeService {

    private Employee people1;
    private Employee people2;
    private Employee people3;
    private Employee people4;
    private Employee people5;
    private Employee people6;
    private Employee people7;
    private EmployeeServiceImpl employeeService;
    Map<Integer, Employee> actual;

    @BeforeEach
    public void setUp() {

        people1 = new Employee("Иванов", "Иван", 50000, 3);
        people2 = new Employee("Иванов1", "Иван1", 500200, 3);
        people3 = new Employee("Иванов2", "Иван2", 501000, 1);
        people4 = new Employee("Иванов3", "Иван3", 507000, 2);
        people5 = new Employee("Иванов4", "Иван4", 550000, 2);
        people6 = new Employee("Иванов5", "Иван5", 530000, 3);
        people7 = new Employee("Иванов6", "Иван6", 503000, 3);

        employeeService = new EmployeeServiceImpl();

        employeeService.addEmployee(people1);
        employeeService.addEmployee(people2);
        employeeService.addEmployee(people3);
        employeeService.addEmployee(people4);
        employeeService.addEmployee(people5);
        employeeService.addEmployee(people6);

        actual = new HashMap<>(Map.of());
        actual.put(1, people1);
        actual.put(2, people2);
        actual.put(3, people3);
        actual.put(4, people4);
        actual.put(5, people5);
        actual.put(6, people6);

    }

    @Test
    public void getEmployee(){
        assertEquals(actual, employeeService.getAllEmployee());
        assertNotNull(employeeService.getAllEmployee());
    }

    @Test
    public void addEmployee(){
        employeeService.addEmployee(people7);
        actual.put(7, people7);
        assertEquals(actual, employeeService.getAllEmployee());
        assertNotNull(employeeService.getAllEmployee());
    }

    @Test
    public void removeEmployee(){
        employeeService.addEmployee(people7);
        employeeService.removeEmployee(people5);
        assertEquals(actual, employeeService.getAllEmployee());
        assertNotNull(employeeService.getAllEmployee());
    }

    @Test
    public void findEmployee(){
        employeeService.findEmployee(people5);
        assertEquals("найден - " + people5, employeeService.findEmployee(people5));
    }

}
