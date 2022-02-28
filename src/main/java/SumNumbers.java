import com.sun.scenario.animation.shared.ClipEnvelope;

public class SumNumbers {

    public static int maxNumber(String a, String b) {
        if (a.length() > b.length())
            return a.length();
        else
            return b.length();
    }

    public static String minWord(String a, String b) {
        if (a.length() >= b.length())
            return b;
        else
            return a;
    }

    public static String maxWord(String a, String b) {
        if (a.length() >= b.length())
            return a;
        else
            return b;
    }

    public static void sumNumbers(String a, String b) {
        int length = maxNumber(a, b);
        int count = 0;

        String newNumber = "";
        String result = "";

        System.out.println("Length is: " + length);

        for (int i = 0; i < Math.abs(a.length() - b.length()); i++) {
            newNumber += "0";
            count++;
        }
        System.out.println("Count is: " + count);

        newNumber += minWord(a, b);
        System.out.println(newNumber);

        String[] number = maxWord(a, b).split("");
        String[] newNumberMas = newNumber.split("");
        int resultNum = 0;
        for (int i = 0; i < length; i++) {
            resultNum = Integer.parseInt(number[i]) + Integer.parseInt(newNumberMas[i]);
            System.out.println(resultNum);
            result += resultNum;
        }
        System.out.println("Result is: " + result);
    }

}
