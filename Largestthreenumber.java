import java.util.*;
public class Largestthreenumber {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number" );
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    // int a = 1000;
    // int b= 50;
    // int c = 30;
    if(b>=a && b>=c){
        System.out.println("b is greater");
    }if(a>=b && a>=c){
        System.out.println("a is greater");
    }else{
        System.out.println("c is greater");
    }
   } 
}
