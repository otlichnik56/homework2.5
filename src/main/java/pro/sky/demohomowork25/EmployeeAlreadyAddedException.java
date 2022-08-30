package pro.sky.demohomowork25;
// если сотрудник уже есть

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String messege) {
        super(messege);
    }
}
