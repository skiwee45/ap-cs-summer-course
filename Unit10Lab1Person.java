import java.time.LocalDate;

public class Unit10Lab1Person {
    private String name, address;
    private String phoneNumber;
    private LocalDate birthDate;

    public Unit10Lab1Person (String name, String address, String phoneNumber, LocalDate birthDate) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate newBirthDate) {
        birthDate = newBirthDate;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + getName();
    }
}
