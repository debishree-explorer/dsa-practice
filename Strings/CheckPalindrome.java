package dsapractice.Strings;

public class CheckPalindrome {
    public static void main(String[] args){
        String str = "Mom";
        str = str.toLowerCase();

        int start = 0;
        int end = str.length()-1;

        boolean ispal = true;

        while(start < end){

        if(str.charAt(start) != str.charAt(end)){
            ispal = false;
            break;
        }
        start++;
        end--;
    }

    if(ispal){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }
}
