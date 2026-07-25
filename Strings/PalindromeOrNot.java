package dsapractice.Strings;

public class PalindromeOrNot {
    public static void main(String[] args){
        String str = "malayalam";
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(ch[start] != ch[end]){
                System.out.println("not a palindrome");
                break;
            }
            else{
                start++;
                end--;
            }
        }
        System.out.println("palindrome");
    }
}
