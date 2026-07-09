public class LinearSearch {
    public static void main(String[] args){
        int a[] = {10,20,30,40,50};
        int search = 20;
        int res = isLinear(a,search);
        if(res == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index: "+res);
        }
    }
    public static int isLinear(int a[], int search){
        for(int i=0;i<a.length;i++){
            if(search == a[i]){
                return i;
            }
        }
        return -1;
    }
}
