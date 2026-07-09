public class ArrayTraversing {
    public static void main(String[] args){
        int[] a = {10,20,30,40,50};
        traversed(a);
        System.out.println();
        reverseTraverse(a);
    }
    public static void traversed(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void reverseTraverse(int a[]){
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}
