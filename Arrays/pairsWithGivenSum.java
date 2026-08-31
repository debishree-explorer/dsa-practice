package dsapractice.Arrays;

import java.util.HashSet;

public class pairsWithGivenSum {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 5, 7, 8, 1};
        int target = 9;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            int nedded = target - num;
            if(set.contains(nedded)){
                System.out.print("("+ nedded + "," + num + ")");
            }
            set.add(num);
        }
    }
}
