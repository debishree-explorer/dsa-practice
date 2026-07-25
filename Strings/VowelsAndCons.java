package dsapractice.Strings;

public class VowelsAndCons {
    public static void main(String[] args){

        String str = "Programming";
        str = str.toLowerCase();
        String vowels = "";
        String conso = "";

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels += ch;
            }
            else{
                conso += ch;
            }
        }
        System.out.print("vowels:"+vowels);
        System.out.print("conso:"+conso);

    }
}
