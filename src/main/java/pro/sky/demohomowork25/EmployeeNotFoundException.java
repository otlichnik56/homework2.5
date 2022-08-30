package pro.sky.demohomowork25;
// если сотрудник не найден

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String messege) {
        super(messege);
    }

}
