public class ReverseString {
    public static void main(String[] args){
        String s = "java";
        char[] ch = s.toCharArray();
        int st = 0;
        int end = s.length()-1;
        
        while(st<end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;

            st++;
            end--;

        }
        String rev = new String(ch);
        System.out.print(rev);
    }
}
