public class RemoveDuplicates {
    public static void main(String[] args){

        int a[] = {10,10,20,20,30,30,40,40,50,50};
        int size = isDuplicated(a);

        for(int i=0 ; i<size ;i++){
        System.out.print(a[i]+" ");
        }

    }
    static int isDuplicated(int a[]){
        int i = 0;
        for(int j=1 ; j<a.length ; j++){
            if(a[j]!=a[i]){
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
    }
}
