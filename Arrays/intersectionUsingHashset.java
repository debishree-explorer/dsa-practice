package dsapractice.Arrays;

import java.util.HashSet;

public class intersectionUsingHashset {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,3,4,4,};
        int[] arr2 = {3,4,4};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();
        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
