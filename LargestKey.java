public class LargestKey {
    public static int LargestKeyValue(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14};
        int key = 1;
        int result= (LargestKeyValue(number, key));
        System.out.println(result);
    }
    
}
