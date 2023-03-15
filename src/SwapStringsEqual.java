import java.util.*;
public class SwapStringsEqual {
    public static void main (String[] args){
        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(areAlmostEqual(s1, s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int missmatchAIndex = -1;
        int missmatchBIndex = -1;

        for (int i = 0; i < s1.length(); i++) {
            char charS1 = s1.charAt(i); // get the i character of the first string
            char charS2 = s2.charAt(i); // get the i character of the second string

            if (charS1 != charS2) {
                if (missmatchAIndex == -1) {
                    missmatchAIndex = i;
                } else if (missmatchBIndex == -1) {
                    missmatchBIndex = i;
                } else {
                    return false;
                }
            }
        }

        if (missmatchBIndex == -1)
            return false;

        return s1.charAt(missmatchAIndex) == s2.charAt(missmatchBIndex) && s1.charAt(missmatchBIndex) == s2.charAt(missmatchAIndex);
    }
}