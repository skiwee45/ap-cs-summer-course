import javax.swing.JOptionPane;

public class Unit9Activity1Test {
    public static void main(String[] args) {
        Unit9Activity1 date = new Unit9Activity1();

        date.setYear(Input.getInt("What year is it?"));
        date.setMonth(Input.getInt("What month is it?"));
        date.setDay(Input.getInt("What day is it?"));
        JOptionPane.showMessageDialog(null, "The date is " + date);
    }
}
