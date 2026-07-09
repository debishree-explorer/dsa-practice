public class CountOccurances {
    public static void main(String[] args){
        int[] a = {10,20,20,30,20,40,20,50,20};
        int ele = 2;
        int res = isOccured(a, ele);
        if(res == 0){
            System.out.println("not found");
        }else{
        System.out.println("the element occured "+res+" times in an array");
        }
    }
    public static int isOccured(int[] a , int ele){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == ele){
                count++;
            }
        }
        return count;
    }
}
