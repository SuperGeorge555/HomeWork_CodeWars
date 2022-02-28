public class StringMerge {


    public static String stringMerge(String firstWord, String secondWord, char a) {
        String finalResult = "";
        StringBuilder str = new StringBuilder();

        String first[] = firstWord.split(" ");
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) != a) {
                finalResult += firstWord.charAt(i);
            } else break;
        }
        finalResult += a;
        for (int i = secondWord.length() - 1; i >= 0; i--) {
            if (secondWord.charAt(i) != a) {
                str.append(secondWord.charAt(i));
            } else break;
        }
        str.reverse();
        return finalResult += str;
    }

    public static String stringMergeV2(String firstWord, String secondWord, char a) {
        String str = "dfgghfjdas";
        str.indexOf(a);
        return String.valueOf(str.indexOf(a));
    }
}
