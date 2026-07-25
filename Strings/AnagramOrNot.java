package dsapractice.Strings;

import java.util.Arrays;

public class AnagramOrNot {
    public static void main(String[] args){

        String str1 = "Silent";
        String str2 = "Liste";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(str1.length() != str2.length()){
            System.out.println("not an Anagram");
            return;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram = true;

        for(int i=0 ; i<ch1.length ; i++){
            if(ch1[i] != ch2[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not Anagram");
        }
    }
}
