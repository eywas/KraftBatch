package day02_MyfirstProgram.src.day28_Quiz_Answers;

public class Quiz_Soru_5 {
    public static void main(String[] args) {
        System.out.println(kelimeConcat("Merhaba", "çocuklar"));
        System.out.println(kelimeConcat("Merhaba", "çocuklar", "naber"));

    }
    public static String kelimeConcat(String str1,String str2){
        String result=str1.concat(" "+str2);
        return result;

    }
    public static String kelimeConcat(String str1,String str2,String str3){
        String result=str1.concat(" "+str2.concat(" "+str3));
        return result;

    }
}
