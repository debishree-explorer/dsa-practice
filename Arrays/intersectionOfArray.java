package dsapractice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,2,5};

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr2){
            if(map.containsKey(num) && map.get(num)>0){
                result.add(num);

                map.put(num,map.get(num)-1);
            }
        }

        System.out.println(result);
    }
}
