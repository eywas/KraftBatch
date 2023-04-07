package day02_MyfirstProgram.src.day24_StringClass_Cont;

public class C05_Substring {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        //substring metodu iki şekilde kullanılır
        //Tek Parametreli

        System.out.println(str.substring(5));//Programming Language
        System.out.println(str.substring(0));//Java Programming Language
        System.out.println(str.substring(17));//Language
        System.out.println(str.substring(str.length()));//emptyIndex
        System.out.println(str.substring(str.length()-3));//age
        System.out.println(str.substring(str.length()-8));//Language

        //substring(beginningIndex,endingIndex) endingIndex dahil değil

        System.out.println(str.substring(2, 4));//va
        System.out.println(str.substring(2, 16));//Programming
        System.out.println(str.substring(0, 1));//J
        System.out.println(str.substring(str.length()-1,str.length()));//e
        System.out.println(str.substring(5, 5));//""
        System.out.println(str.substring(4, 5));//" "
       // System.out.println(str.substring(5, 3));//hata verir. //Runtime Error (StringIndexOutOfBoundsException)





    }
}
