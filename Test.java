import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String answerKeyString = AnswerChecker.readFileAsString("D:\\Downloads\\SATAnswerKey.txt").toUpperCase();
        System.out.println(answerKeyString);
    }
}
