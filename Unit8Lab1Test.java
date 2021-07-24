public class Unit8Lab1Test {
    public static void main(String[] args) {
        Unit8Lab1 rect = new Unit8Lab1(1, 2);
        System.out.printf("Unchanged Rectangle- l: 1, w: 2, perimeter: %d, area: %d", rect.getPerimeter(), rect.getArea());
        rect.printRectangle('*');

        rect.setLength(5);
        rect.setWidth(10);
        System.out.printf("%nChanged Rectangle- l: 5, w: 10, perimeter: %d, area: %d", rect.getPerimeter(), rect.getArea());
        rect.printRectangle('*');
    }
}
