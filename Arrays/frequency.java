package dsapractice.Arrays;
import java.util.HashMap;

public class frequency {
    public static void main(String[] args){
        HashMap <Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,1,4,1,4,2,5,3,6};

        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

    }
}
