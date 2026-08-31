package dsapractice.Arrays;

import java.util.HashMap;

public class TwoSumLeetCode {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            int nedded = target - arr[i];

            if(map.containsKey(nedded)){
                System.out.print("["+ map.get(nedded) + "," + i+"]");
                return;
            }
            map.put(arr[i], i);
        }
    }
    
}
