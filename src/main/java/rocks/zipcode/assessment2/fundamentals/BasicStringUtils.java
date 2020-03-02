package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {


        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String [] resultArray = string1.split("");
        String result="";

        for (int i=resultArray.length-1; i>=0; i--){
            result+=resultArray[i];
        }

        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String s = reverse((string1));
        String p = reverse(string2);

        return s+p;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
       String[] array= charactersToRemove.split("");
        String [] strings= string.split("");
        String result ="";
        String answer=string;

           for ( int i=0; i<array.length;i++) {


           result= answer.replaceAll(array[i],"");
               answer=result;


       }
     return answer;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String s=removeCharacters(string,charactersToRemove);
        String ans=reverse(s);
        return ans;
    }
}
