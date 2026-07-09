public class SumOfAllElements {
    public static void main(String[] args){
        int a[] = {10,20,30,40,50};
        int result = sum(a);
        System.out.print(result);
    }
    public static int sum(int a[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        return sum;
    }
}
