import java.time.LocalDate;

public class Unit10Lab1Student extends Unit10Lab1Person{
    private String classStatus;

    public Unit10Lab1Student(String name, String address, String phoneNumber, LocalDate birthDate, String classStatus) {
        super(name, address, phoneNumber, birthDate);
        setClassStatus(classStatus);
    }

    public String getClassStatus() {
        return classStatus;
    }
    public void setClassStatus(String newClassStatus) {
        classStatus= newClassStatus;
    }
}
