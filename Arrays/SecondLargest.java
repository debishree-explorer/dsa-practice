public class SecondLargest{
    public static void main(String[] args){
        int a[] = {10,90,20,100,40,60};
        int result = secondLargest(a);
        System.out.println("the second largest is:"+result);
    }
    static int secondLargest(int a[]){
        int lar , seclar;
        if(a[0] > a[1]){
            lar = a[0];
            seclar = a[1];
        }else {
            lar = a[1];
            seclar = a[0];
        }
        for(int i=2 ; i<a.length ; i++){
            if(a[i] > lar){
                seclar = lar;
                lar = a[i];
            }else if(a[i] > seclar && a[i]!= lar){
                seclar = a[i];
            }
        }
        return seclar;
    }

}