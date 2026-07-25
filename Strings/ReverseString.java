package dsapractice.Strings;

public class ReverseString {
    public static void main(String[] args){
        String str = "Hello";
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        System.out.println(ch);
    }
}
