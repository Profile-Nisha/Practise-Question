import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum =0;
        int i = 1;
        while(num >= i){
           sum += i;
           i++; 
        }

        System.out.println(sum);
    }
    
}
