import java.util.Scanner;

/**
 * Purpose is to determine if a triangle is valid and what type of triangle it is
 * @author Raymond Lin
 */
public class Unit3Lab1  {
    public static void main(String[] args) {
        //get input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter 3 numbers separated by spaces that represent the sides of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        input.close();
        int[] sides = {side1, side2, side3};

        //check if valid
        int total = sum(sides);
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] >= total - sides[i] || sides[i] <= 0) {
                System.out.printf("%n%d %d %d The values entered do not make a valid triangle.", sides[0], sides[1], sides[2]); 
                return;
            }
        }

        //determine type
        String triangleType = "a scalene";
        switch (findLengthPairsAmount(sides)) {
            case 3:
            case 2:
                triangleType = "an equilateral";
                break;
            case 1:
                triangleType = "an isosceles";
                break;
            default:
                break;
        }
        //display
        System.out.printf("%n%d %d %d creates %s triangle", sides[0], sides[1], sides[2], triangleType);
    }

    private static int sum(int[] arr){
        int output = 0;
        for (int i : arr) {
            output += i;
        }
        return output;
    }

    private static int findLengthPairsAmount(int[] lengths){
        int output = 0;
        for (int i = 0; i < lengths.length; i++) {
            int length = lengths[i];
            for (int j = i + 1; j < lengths.length; j++) {
                if (length == lengths[j]){
                    output++;
                }
            }
        }
        return output;
    }
}
