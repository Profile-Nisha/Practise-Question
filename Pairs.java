public class Pairs {
    public static void pairsum(int arr[]){
        int tp = 0;
        for(int i = 0; i< arr.length; i++){
            int currvalue = arr[i];
            for(int j = i+1; j < arr.length; j++){
                System.out.print("("+ arr[i]+ " , " + arr[j] + " )");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println(tp);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        pairsum(arr);
    }
    
}
