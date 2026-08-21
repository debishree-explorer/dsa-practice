package dsapractice.Arrays;

public class largestElement {
    public static void main(String[] args){
    int[] arr = {10,30,50,20};
    int larg = arr[0];

    for(int i=0 ; i<arr.length ; i++){
        if(arr[i]>larg){
            larg = arr[i];
        }
    }
    System.out.println("largest:"+larg);
}
}