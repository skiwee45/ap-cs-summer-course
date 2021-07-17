import java.util.Scanner;

public class Unit5Lab3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] student1Grades = new int[4];
        int[] student2Grades = new int[4];
        int[] student3Grades = new int[4];
        int[][] students = {student1Grades, student2Grades, student3Grades};
        for (int i = 0; i < 3; i++) {
            System.out.print("Input 4 test grades for student " + (i + 1) + " separated by spaces: ");
            for (int j = 0; j < 4; j++) {
                students[i][j] = input.nextInt();
            }
        }
        input.close();

        //heading
        System.out.println("\n");
        System.out.println(Unit5Lab2.centerString("Grades", 37));
        System.out.println(Unit5Lab2.repeatString("-", 37));
        System.out.println("Student   Min   Max   Average   Grade");
        for (int i = 0; i < students.length; i++) {
            printStudentGrades(i + 1, students[i]);
        }
    }

    private static void printStudentGrades (int studentNumber, int[] grades) {
        int min = minimum(grades);
        int max = maximum(grades);
        double average = average(grades);
        char letterGrade = calculateLetterGrade(average);
        System.out.printf("%7d%6d%6d%9.1f%%%8s%n",
            studentNumber, min, max, average, letterGrade);
    }

    private static int minimum (int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i : values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int maximum (int[] values) {
        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static double average (int[] values) {
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return Unit5Activity1D.round((double) total / values.length, 1);
    }

    /**
     * Calculate a letter grade based on percentage
     * @param gradePercentage assumed to be 0 - 100
     * @return a letter grade: A, B, C, D, F
     */
    private static char calculateLetterGrade (double gradePercentage) {
        char grade = 'F';
        if (gradePercentage >= 90) {
            grade = 'A';
        } else if (gradePercentage >= 80) {
            grade = 'B';
        } else if (gradePercentage >= 70) {
            grade = 'C';
        } else if (gradePercentage >= 65) {
            grade = 'D';
        }
        return grade;
    }
}
