public class ConvertLowerToUpper {
    public static void main(String[] args){
        String s1 = "java";
        String res = "";

        for(int i=0; i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch >='a' && ch <= 'z'){
                res += (char)(ch - 32);
            }
            else{
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
