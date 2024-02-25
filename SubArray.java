public class SubArray {
    public static void Subarray(int arr[]){
        int sum =0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = i; k <=  j; k++){
                    System.out.print(" "+ arr[k]);
                    sum++;
                }
                System.out.println();
            }
            System.out.println("total sum" + sum);
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        Subarray(arr);
    }
    
}
