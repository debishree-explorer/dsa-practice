package dsapractice.Strings;

public class CountVowelsAndConsonant {
    public static void main(String[] args){
        String str = "Elephant";
        str = str.toLowerCase();
        
        int count1 = 0;
        int count2 = 0;

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) =='e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count1++;
            }else{
            count2++;
            }
        }
        System.out.println("vowels: "+count1);
        System.out.println("consonants: "+count2);
    }
}
