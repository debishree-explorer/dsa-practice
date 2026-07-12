import java.util.Scanner;

public class OneDArray {
    //Creation of array
    int arr[] = null;

    public OneDArray(int n) {
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;


        }

    // System.out.print(Arrays.toString(arr));

    }

    //   insert an element
    public void insert(int position, int value) {
        try {
            if (arr[position] == Integer.MAX_VALUE) {
                arr[position] = value;
                System.out.println("value added sucessfully");
            }
        } catch (Exception e) {

            // System.out.print("Array index out of bound");
            e.printStackTrace();
        }
    }

    //Traversal.......
    public void Traversal() {
        if (arr.length == 0) {
            System.out.print("no elements to traverse");

        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }

        }

//Fetch Bassed on INdex..................
                public void Fetch ( int index){
                    if (index >= arr.length) {
                        System.out.print("Invalid index");
                    } else {
                        System.out.print(arr[index]);
                    }
                }
//searching


        public void search ( int element){

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == element) {
                    System.out.println("Element found at index " + i);
                    return;
                }
            }
            System.out.println("Element not found");
        }

//Update
        public void update(int indexx,int valuee){
        int n=arr.length-1;
            System.out.println("Enter a value between 0 to "+n);
            try{
                arr[indexx]=valuee;
                System.out.println("value is updated");
                Traversal();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        //Delete

        public void delete(int index){
        try{
            arr[index]=Integer.MAX_VALUE;
            System.out.println("value is deleted");
            Traversal();

        }catch(Exception e){
            e.printStackTrace();
        }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        OneDArray o=new OneDArray(size);
        for( int i=0;i<size;i++){
            System.out.println("Enter an index position");
            int ind=sc.nextInt();
            System.out.println("Enter an element");
            int ele=sc.nextInt();
           o.insert(ind,ele);
        }

    //    o.insert(0,12);
    //    o.insert(1,20);
    //    o.insert(2,19);
    //    o.insert(3,40);
       System.out.println(".........................");
       o.Traversal();
       System.out.println(".........................");
       System.out.println("Enter a index position to find ");
       o.Fetch(sc.nextInt());
       System.out.println(".........................");
       System.out.println("Enter an element to search");
       o.search(sc.nextInt());

       System.out.println(".........................");
       System.out.println("Enter an index to update");
       int ind=sc.nextInt();
       System.out.println("Enter an element to update the value");
       int up=sc.nextInt();
       o.update(ind,up);

       System.out.println(".........................");
       System.out.println("Enter an index position to delete between 0 to"+size);
       o.delete(sc.nextInt());

       sc.close();
    }
}