import java.util.HashSet;

public class StringDuplicates {
    public static void main(String[] args){
        String s = "banana";
    
        HashSet<Character> h = new HashSet<>();
        for(Character ch:s.toCharArray()){
            h.add(ch);
        }
        System.out.println("result: "+h);
    }
}
