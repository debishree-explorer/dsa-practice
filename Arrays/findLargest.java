
public class findLargest{
    public static void main(String[] args){
        int num[] = {2,3,4,12,6,24};
        int largest = num[0];

        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        System.out.println("largest"+largest);
    }
}