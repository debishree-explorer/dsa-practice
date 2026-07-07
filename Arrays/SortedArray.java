public class SortedArray {
    public static void main(String[] args){
        int a[] = {10,20,30,6};
        boolean result = isSorted(a);

        if(result){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is notsorted");
        }

    }
    static boolean isSorted(int[] a){
        for(int i=0 ; i<a.length-1 ; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
                return true;
    }
}
