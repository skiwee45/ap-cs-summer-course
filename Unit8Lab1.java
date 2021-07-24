public class Unit8Lab1 {
    private int length;
    private int width;

    public Unit8Lab1(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        if (newLength < 1 || newLength > 30) {
            throw new IllegalArgumentException("Length must be between 1 and 30\n\n");
        }
        length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        if (newWidth < 1 || newWidth > 30) {
            throw new IllegalArgumentException("Width must be between 1 and 30\n\n");
        }
        width = newWidth;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (length + width) * 2;
    }

    public void printRectangle(char border) {
        StringBuilder printString = new StringBuilder();

        // first row
        printString.append("\n");
        for (int i = 0; i < width; i++) {
            printString.append(border);
        }

        if (length >= 2 && width >= 2) {
            // middle rows
            for (int i = 0; i < length - 2; i++) {
                printString.append(String.format("%n%c%" + (width - 1) + "c", border, border));
            }
            
            // last row
            printString.append("\n");
            for (int i = 0; i < width; i++) {
                printString.append(border);
            }
        } else if (width == 1) {
            // middle and last rows
            for (int i = 0; i < length - 1; i++) {
                printString.append(String.format("%n%c", border));
            }
        }

        System.out.println(printString.toString());
    }
}
