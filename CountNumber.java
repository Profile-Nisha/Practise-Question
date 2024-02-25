import java.util.*;
public class CountNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        // int num = 12345678;
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }

        System.out.println("total count:" + count);
    }
    
}
