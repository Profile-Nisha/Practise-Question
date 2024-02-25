
import java.util.*;

public class PallindromeString {
    public static boolean Pallindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) == str.charAt(n - i - 1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "madam";
        if (Pallindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
