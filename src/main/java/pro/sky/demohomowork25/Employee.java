package pro.sky.demohomowork25;


public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private  int depId;

    public Employee(String firstName, String lastName, int salary, int depId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.depId = depId;
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

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepId() {
        return this.depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String toString() {
        return "Имя: " + this.firstName + ", Фамилия: " + this.lastName + " , з/п: " + this.salary + " , отдел: " + this.depId;
    }

    public boolean equals(Employee employee) {
        return (employee.getFirstName().equals(this.firstName) && employee.getLastName().equals(this.lastName)
                && employee.getSalary() == this.salary && employee.getDepId() == this.depId);
    }

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.firstName.hashCode();
        hash = 31 * hash + this.lastName.hashCode();
        return hash;
    }

    public static int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        }
        return -1;
    }

}
