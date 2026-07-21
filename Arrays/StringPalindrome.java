public class StringPalindrome {
    public static void main(String[] args){

        String s = "Malayalam";
        System.out.println(isPal(s));
        

    }
    public static String isPal(String s){
        
        char[] ch = s.toCharArray();
        int st = 0, end = ch.length-1;

        while(st<end){
            if(ch[st]!=ch[end]){
                return "is not a palindrome";
            }else{
                st++;
                end--;
            }
        }
        return "is a palindrome!" ;
    }
}
