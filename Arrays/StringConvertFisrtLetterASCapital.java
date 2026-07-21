import java.util.Arrays;

public class StringConvertFisrtLetterASCapital {
    public static void main(String[] args){
        String s = "java is an oop lang";
        String[] str = s.split("\s+");
        System.out.println(Arrays.toString(str));
        String res = "";


        for(int i=0; i<str.length; i++){
            if(str[i] != ""){
                char[] ch = str[i].toCharArray();
                if(ch[0] >= 'a' && ch[0] <= 'z')
                    ch[0] = (char) (ch[0] - 32);

                res += new String(ch);
                res+=" ";

            }
        }
        System.out.println(res.trim());
    }
}
