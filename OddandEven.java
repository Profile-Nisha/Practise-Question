import java.util.*;
public class OddandEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;
        while(num > 0){
            int rem = num%10;
            if(rem % 2 == 0){
                even++;
            }else{
                odd++;
            }
            num=num/10;
        }
        System.out.println(odd + " " + even);

    }
    
}
