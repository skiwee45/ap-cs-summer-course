public class Unit5Activity1B {
    public static void main(String[] args) {
        for (int i = 1; i <= 20 ; i++) {
            System.out.print(generateRandomNum(1, 5) + "\t");
        }
    }

    public static int generateRandomNum(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
}
