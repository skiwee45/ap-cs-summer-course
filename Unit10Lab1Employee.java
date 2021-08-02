import java.time.LocalDate;

public class Unit10Lab1Employee extends Unit10Lab1Person{
    private double salary;
    private LocalDate hireDate;

    public Unit10Lab1Employee(String name, String address, String phoneNumber, LocalDate birthDate, double salary, LocalDate hireDate) {
        super(name, address, phoneNumber, birthDate);
        setSalary(salary);
        setHireDate(hireDate);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate newHireDate) {
        hireDate = newHireDate;
    }
}
