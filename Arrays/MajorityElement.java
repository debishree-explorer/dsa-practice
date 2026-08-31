package dsapractice.Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {1,2,1,2,2,2,1,1,2};

        HashMap<Integer , Integer>map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int limit = arr.length/2;
        for(int key : map.keySet()){

            System.out.println("key"+key + "->" +map.get(key));

            if(map.get(key) > limit){
                System.out.print(key);
                break;
            }
        }
    }
}
