package day02_MyfirstProgram.src.day29_FullReview;

public class C03_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"AABBCCBC\") = " + removeDuplicates("AABBCCBC"));
    }
    public static String removeDuplicates(String str){
        String result="";
        for (int i=0; i<str.length();i++){
            String ch=""+str.charAt(i);// burada ch String olarak ifade edilmiş oldu
            if (!result.contains(ch)){ // Eğer result Stringinin içinde ch karakteri yoksa eklesin
                result+=ch;
                }
        }
        return result;
    }
}
/*Write a method that can remove the duplicated characters from a String
        Ex:
        input:
        AABBCCBC

        Output:
        ABC

        Hint: You can add each characters of the string into another String
        Condition: the character is not contained in the other String yet before you are adding*/
