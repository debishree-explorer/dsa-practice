package dsapractice.Arrays;

public class duplicateNumber {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,4};
        int i=0;
        
        for(int j=0 ; j<arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0 ; k<=i ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
