import java.util.HashSet;
public class removeDuplicatesUsingHashset {
    public static void main(String[] args){
       int a[] = {10,20,20,10,30,30,10};

        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {

            if (!set.contains(num)) {
                set.add(num);
                System.out.print(num + " ");
            }
        }
    }
}
