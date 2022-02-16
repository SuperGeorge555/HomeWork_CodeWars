public class StringMerge {


    public static String stringMerge(String firstWord, String secondWord, char a) {
        String finalResult = "";

        String first[] = firstWord.split(" ");
        for(int i = 0; i < firstWord.length(); i++){
            if(firstWord.charAt(i) != a){
                finalResult += firstWord.charAt(i);}
        else break;
        }
        finalResult +=a;
        for(int i = secondWord.length()-1; i >= 0; i--){
            if(secondWord.charAt(i) != a){
                finalResult += secondWord.charAt(i);}
            else break;
        }

        return finalResult;

}
}
