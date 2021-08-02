import java.time.LocalDate;

public class Unit10Lab1Staff extends Unit10Lab1Employee{
    private String jobTitle;

    public Unit10Lab1Staff(String name, String address, String phoneNumber, LocalDate birthDate, double salary,
            LocalDate hireDate, String jobTitle) {
        super(name, address, phoneNumber, birthDate, salary, hireDate);
        setJobTitle(jobTitle);
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String newJobTitle) {
        jobTitle = newJobTitle;
    }
}
