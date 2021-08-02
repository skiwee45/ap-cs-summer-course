import java.time.LocalDate;

public class Unit10Lab1Test {
    public static void main(String[] args) {
        Unit10Lab1Person person = new Unit10Lab1Person("P1", "Home", "999-999-9999", LocalDate.of(1, 1, 1));
        Unit10Lab1Student student = new Unit10Lab1Student("P2", "Home", "999-999-9999", LocalDate.of(1, 1, 1),
                "Freshman");
        Unit10Lab1Employee employee = new Unit10Lab1Employee("P3", "Home", "999-999-9999", LocalDate.of(1, 1, 1), 30.5,
                LocalDate.of(2, 2, 2));
        Unit10Lab1Faculty faculty = new Unit10Lab1Faculty("P4", "Home", "999-999-9999", LocalDate.of(1, 1, 1), 30.5,
            LocalDate.of(2, 2, 2), "10-3", "Professor");
        Unit10Lab1Staff staff = new Unit10Lab1Staff("P5", "Home", "999-999-9999", LocalDate.of(1, 1, 1), 30.5,
            LocalDate.of(2, 2, 2), "Security Guard");
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
