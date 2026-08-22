package dsapractice.Arrays;

public class missingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n = arr.length+1;
        
        int xor = 0;
        for(int i=1 ; i<=n ; i++){
            xor = xor ^ i;
        }
        for(int i=0 ; i<arr.length ; i++){
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
