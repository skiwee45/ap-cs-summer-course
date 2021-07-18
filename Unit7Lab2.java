public class Unit7Lab2 {
    public static void main(String[] args) {
        System.out.println("\nThe binary number 1011 in decimal form is: " + binaryToDecimal("1011"));
        System.out.println("The binary number 1011 in hex form is: " + binaryToHex("1011"));
        System.out.println("The decimal number 500 in binary form is: " + decimalToBinary(500));
        System.out.println("The decimal number 500 in hex form is: " + decimalToHex(500));
    }

    public static int binaryToDecimal(String binaryString) {
        int total = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            total += charToInt(binaryString.charAt(i)) * (int) Math.pow(2, binaryString.length() - i - 1);
        }
        return total;
    }

    public static String binaryToHex(String binaryString) {
        int firstSetSize = binaryString.length() % 4;
        StringBuilder total = new StringBuilder();
        int decimalRepresentation;
        if (firstSetSize > 0) {
            decimalRepresentation = binaryToDecimal(binaryString.substring(0, firstSetSize));
            if (decimalRepresentation > 9) {
                total.append('A' + decimalRepresentation - 10);
            } else {
                total.append(decimalRepresentation);
            }
        }

        for (int i = 0; i < binaryString.length() / 4; i++) {
            decimalRepresentation = binaryToDecimal(binaryString.substring(firstSetSize + 4 * i, firstSetSize + 4 * i + 4));
            if (decimalRepresentation > 9) {
                total.append((char)('A' + decimalRepresentation - 10));
            } else {
                total.append(decimalRepresentation);
            }
        }
        return total.toString();
    }

    public static String decimalToBinary(int decimalNumber) {
        int temp = 1;
        int i = 0;
        while (temp <= decimalNumber) {
            i++;
            temp = (int) Math.pow(2, i);
        }
        StringBuilder output = new StringBuilder();
        for (int j = i - 1; j >= 0; j--) {
            output.append(decimalNumber / (int) Math.pow(2, j));
            decimalNumber %= (int) Math.pow(2, j);
        }
        return output.toString();
    }

    public static String decimalToHex(int decimalNumber) {
        return binaryToHex(decimalToBinary(decimalNumber));
    }

    public static int charToInt(char character) {
        int number = character - '0';
        if (number < 0) {
            return 0;
        }
        if (number > 9) {
            return 9;
        }
        return number;
    }
}
