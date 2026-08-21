package dsapractice.Arrays;

public class moveAllZeros {
    public static void main(String[] args){
        int[] arr = {0,0,3,0,12,0,3,2,1};
        int i=0;

        for(int j=0 ; j<arr.length ; j++){

            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
        
    }
}
