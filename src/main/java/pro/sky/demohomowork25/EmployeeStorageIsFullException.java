package pro.sky.demohomowork25;
// если массив переполнен

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException(String messege) {
        super(messege);
    }

}
