import java.time.LocalDate;

public class Unit10Lab1Faculty extends Unit10Lab1Employee {
    private String officeHours, rank;

    public Unit10Lab1Faculty(String name, String address, String phoneNumber, LocalDate birthDate, double salary,
            LocalDate hireDate, String officeHours, String rank) {
        super(name, address, phoneNumber, birthDate, salary, hireDate);
        setOfficeHours(officeHours);
        setRank(rank);
    }
    
    public String getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(String newOfficeHours) {
        officeHours = newOfficeHours;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String newRank) {
        rank = newRank;
    }
}
