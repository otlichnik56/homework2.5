package pro.sky.demohomowork25;

import org.apache.commons.lang3.StringUtils;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Имя: " + this.firstName + ",  Фамилия: " + this.lastName;
    }

    public boolean equals(Employee employee) {
        return StringUtils.equals(employee.getFirstName(), this.firstName) &&
                StringUtils.equals(getLastName(), this.lastName);
    }

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.firstName.hashCode();
        hash = 31 * hash + this.lastName.hashCode();
        return hash;
    }

}
