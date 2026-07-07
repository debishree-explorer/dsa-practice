public class ReverseArray {
    public static void main(String[] args){
        System.out.println("hello");
        int a[] = {90,100,20,39,40};
        reverse(a);
        for(int num : a)
        System.out.println(num);
    }
    static void reverse(int a[]){
        int start=0;
        int end=a.length-1;
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
}
