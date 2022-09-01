package pro.sky.demohomowork25;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// если сотрудник уже есть
@ResponseStatus (HttpStatus.SERVICE_UNAVAILABLE)
public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String messege) {
        super(messege);
    }
}
