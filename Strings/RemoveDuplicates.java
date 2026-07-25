package dsapractice.Strings;

public class RemoveDuplicates {
    public static void main(String[] args){
        String str = "Programming";
        str = str.toLowerCase();
        

        String res  = "";
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }
        System.out.println("original string:"+str);
        System.out.println("modified string:"+res);
    }
}
