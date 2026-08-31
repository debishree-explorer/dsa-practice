package dsapractice.Arrays;

public class consecutiveOfElements {
    public static void main(String[] args){
        int[] arr = {2,1,2,2,2,3,3,3,3,4,4};
        int count = 1;
        int max = 1;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count > max)
            max=count;
        }
        System.out.println(max);
        
    }
}
