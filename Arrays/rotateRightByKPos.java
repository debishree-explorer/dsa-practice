package dsapractice.Arrays;

public class rotateRightByKPos {

    static void reverse(int[] arr,int left,int right){

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int k2 = arr.length-k;

        reverse(arr, k2, arr.length-1);
        reverse(arr, 0, k2-1);
        reverse(arr, 0, arr.length-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
