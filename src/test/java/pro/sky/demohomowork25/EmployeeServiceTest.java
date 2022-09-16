package pro.sky.demohomowork25;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeServiceTest {

=======
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {

    private String fName = "Smite";
    private String lName = "Joy";
    private int zP = 52000;
    private int iD = 5;
>>>>>>> origin/homework2.13
    private Employee people1;
    private Employee people2;
    private Employee people3;
    private Employee people4;
    private Employee people5;
    private Employee people6;
    private Employee people7;
<<<<<<< HEAD
    private EmployeeService employeeService;
    Map<Integer, Employee> actual;
=======
    private Map<String, Employee> employers;
>>>>>>> origin/homework2.13

    @BeforeEach
    public void setUp() {

        people1 = new Employee("Иванов", "Иван", 50000, 3);
        people2 = new Employee("Иванов1", "Иван1", 500200, 3);
        people3 = new Employee("Иванов2", "Иван2", 501000, 1);
        people4 = new Employee("Иванов3", "Иван3", 507000, 2);
        people5 = new Employee("Иванов4", "Иван4", 550000, 2);
        people6 = new Employee("Иванов5", "Иван5", 530000, 3);
        people7 = new Employee("Иванов6", "Иван6", 503000, 3);

<<<<<<< HEAD
        employeeService = new EmployeeService();

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
        assertEquals(actual, employeeService.getEmployers());
        assertNotNull(employeeService.getEmployers());
    }

    @Test
    public void addEmployee(){
        employeeService.addEmployee(people7);
        actual.put(7, people7);
        assertEquals(actual, employeeService.getEmployers());
        assertNotNull(employeeService.getEmployers());
    }

    @Test
    public void removeEmployee(){
        employeeService.addEmployee(people7);
        employeeService.removeEmployee(people7);
        assertEquals(actual, employeeService.getEmployers());
        assertNotNull(employeeService.getEmployers());
    }

    @Test
    public void findEmployee(){
        employeeService.findEmployee(people5);
        assertEquals("найден - " + people5, employeeService.findEmployee(people5));
    }
=======
        employers = new HashMap<>(Map.of(
                "123", people1,
                "456", people2,
                "789", people3,
                "147", people4,
                "258", people5,
                "369", people6)
        );
    }

    @Test
    public void addEmployee(Employee people7){
        addEmployee(people7);
        Map<String, Employee> actual = new HashMap<>(Map.of());
        actual.put("123", people1);
        actual.put("456", people2);
        actual.put("789", people3);
        actual.put("147", people4);
        actual.put("258", people5);
        actual.put("369", people6);
        assertEquals(actual, employers);
    }



>>>>>>> origin/homework2.13

}
