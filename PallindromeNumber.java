import java.util.*;
public class PallindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int originalnum = num;
        int rev = 0;
        while(num != 0){
        rev = rev*10 + num%10;
        num = num/10;}
        if(originalnum == rev){
            System.out.println("number is pallindrome");
        }else{
            System.out.println("number is not pallindrome");
        }
    }
    
    
}
