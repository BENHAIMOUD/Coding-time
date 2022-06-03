package other_exercices;
import java.util.Arrays;
import java.util.Optional;

public class RepeatedSuccessiveChars {
    /*
      create a function that represent successive characters as a single count and character.
      example: the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A";
     */
    static String repeatedChars(String words){
        String newWords = "";
        int counter = 0;
        char currentChar = words.charAt(0);
        for (int i=0; i< words.length(); i++){
            if (currentChar == words.charAt(i))
                counter++;
            else {
                newWords+= String.valueOf(counter) +currentChar;
                currentChar = words.charAt(i);
                counter = 1;
            }
        }
        return newWords;
    }
    public  static void main(String [] argc){
        String words  = "AAAABBBCCD";
        System.out.println(repeatedChars(words));

    }
}
