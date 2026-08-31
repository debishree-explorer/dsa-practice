package dsapractice.Arrays;

import java.util.HashSet;

public class unionOfArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,3,4};
        int[] arr2 = {3,4,5,5,6,7,7};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}
