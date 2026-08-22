package dsapractice.Arrays;

public class leftRotateByKposition {

    static void reverse(int[] arr, int left ,int right){

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int k = 3;

        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);

        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }

    }
}
