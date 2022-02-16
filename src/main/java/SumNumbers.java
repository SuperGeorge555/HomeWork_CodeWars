import com.sun.scenario.animation.shared.ClipEnvelope;

public class SumNumbers {
    private String firstNumber;
    private String secondNumber;

    private static int minNumber(String a, String b) {
        if (a.length() > b.length())
            return b.length();
        else
            return a.length();
    }

    public static void sumNumbers(String a, String b) {
        int length = minNumber(a, b);
        System.out.println("Length is: " + length);
        String result = "";


        String[] numA = a.split("");
        String[] numB = b.split("");
        int resultNum = 0;
        for (int i = length-1; i >= 0; i--) {
            resultNum = Integer.parseInt(numA[i]) + Integer.parseInt(numB[i]);
            System.out.println(resultNum);
            result += resultNum;
        }
        System.out.println("Result is: " + result);

    }

}
