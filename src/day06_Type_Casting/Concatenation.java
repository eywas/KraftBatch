package day02_MyfirstProgram.src.day06_Type_Casting;

public class Concatenation {
    public static void main(String[] args) {
        String a = "Merhaba";
        String b = "Dünya";
        String c = a + b;
        System.out.println(c + " Bugün nasılsın");
        System.out.println(5 + 2 + c);
        System.out.println(3 + 8 + a + 2 + 5);
        System.out.println(3 + 8 + a + (2 + 5) + 7); /*parantez içini toplar diğer işlemleri string e kadar
         toplar sonrasını string olarak algılar
         */


    }

}
