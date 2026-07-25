package dsapractice.Strings;

public class CaseConverstion {
    public static void main(String[] args){
        String str = "java PROGRAMMING";
        char[] ch = str.toCharArray();

        for(int i=0 ; i<str.length() ; i++){

            if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] = (char)(ch[i]-32);
            }
            else if(ch[i] >='A' && ch[i] <='Z'){
                ch[i] = (char)(ch[i]+32);
            }

        }
        System.out.println(new String(ch));
    }
}
