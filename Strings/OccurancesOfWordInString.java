package dsapractice.Strings;

public class OccurancesOfWordInString {
    public static void main(String[] args){
        String str = "The Dog is happy so The Dog is dancing";
        String target = "dog";
        int count = 0;
        str = str.toLowerCase();

        String[] words = str.split(" ");
        
        for(int i=0 ; i<words.length ; i++){
            if(words[i].equals(target)){
                count++;
            }
        }
        System.out.println("the target"+" "+target+" "+"appered:"+" "+count+" "+"times in a stentence");
    }
}
