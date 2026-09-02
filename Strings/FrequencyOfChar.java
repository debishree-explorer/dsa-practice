package dsapractice.Strings;

public class FrequencyOfChar {
    public static void main(String[] args){
        String str = "DebishreeNayak";
        char target = 'e';
        str = str.toLowerCase();

        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == target){
            count++;
            }
        }
        System.out.println("the frequency of strimg is: "+count);
    }
}
