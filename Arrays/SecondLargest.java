package dsapractice.Arrays;

public class secondLargest {
    public static void main(String[] args){
        int[] arr = {10,20,30,80,50};
        int larg = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > larg){
                secLarg = larg;
                larg = arr[i];
            }
            else if(arr[i] > secLarg && arr[i] != larg){
                secLarg = arr[i];
            }
        }
        System.out.println("second largest is:"+secLarg);
    }
}
