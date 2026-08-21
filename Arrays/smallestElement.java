package dsapractice.Arrays;

public class smallestElement {
    public static void main(String[] args){
        int[] arr={90,30,20,40,29,49};
        int small = arr[0];

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < small)
                small = arr[i];
        }
        System.out.println("smallest:"+small);
    }
}
