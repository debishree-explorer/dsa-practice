import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    static void creation(int row,int col){
        int[][] a = new int[row][col];
        System.out.println(Arrays.deepToString(a));
        for(int i = 0; i<a.length ; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    public void insert(int row, int col, int valueToInsert){
        try{
            if(a[i][j] == Integer.MAX_VALUE){
                a[i][j] = valueToInsert;
                System.out.println("value added successfully");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void traversal(){
        if(a.length == 0){
            System.out.println("no elemnt to traverse");
        }else{
            for(int i=0; i<a.length;i++){
                for(int j=0; j<a[i].length ; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public void fetch(int row, int col){
        try{
            System.out.println(a[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
    }

    public void search(int valueToSearch){
        if(a.length > 0){
        for(int i=0; i<a.length; i++){
            for(int j=0;j<a[i].length; j++){
            if(a[i][j] == valueToSearch){
                System.out.println("element found at index"+i);
                return;
            }
        }
    }
    System.out.println("element is not found");
   }else{
         System.out.println("No array elements");
    }
}

public void update (int row,int col, int valueToUpdate){
    try{
        a[row][col] = valueToUpdate;
        System.out.println("value updated succesfully");
        traversal();
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("invalid index");
    }
}

public void deletion(int row,int col){
    try{
        a[i][j] = Integer.MAX_VALUE;
        System.out.println("value is deleted");
        traversal();
    }catch(Exception e){
        System.out.println("not deleted");
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of row:");
    int row = sc.nextInt();
    System.out.println("enter the size of col:");
    int col = sc.nextInt();

    TwoDArray t = new TwoDArray(row,col);

    for(int i=0; i<row; i++){
       for(int j=0; j<col; j++){
        System.out.println("enter the row index:");
        int rowInd = sc.nextInt();
        System.out.println("enter the col index:");
        int colInd = sc.nextInt();

        System.out.println("enter an element to insert:");
        int ele = sc.nextInt();
        t.insert(rowInd, colInd, ele);

        System.out.println(".........................");
       }
    }

    System.out.println(".........................");
    t.traversal();
    System.out.println(".........................");

    System.out.println("enter row:");
    int rowInd = sc.nextInt();
    System.out.println("enter col:");
    inr colInd = sc.nextInt();

    t.fetch(rowInd, colInd);

    System.out.println(".........................");

    System.out.println("enter an element to search:");
    t.search(rowInd);
    

}
}

