import java.util.Scanner;

public class Unit5Activity1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angle in degrees: ");
        int degrees = input.nextInt();
        input.close();

        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        System.out.printf("%nAngle in degrees: %d%nAngle in radians: %f%nSine: %f\tCosine: %f\tTangent: %f", 
            degrees, radians, sin, cos, tan);
    }
}