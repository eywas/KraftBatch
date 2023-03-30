package day02_MyfirstProgram.src.day23_String_Class;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str1="Hello";   // literal way  ---> Heap Memory  ---> String Pool
        String str2="Hello";  // str2--> String Pool daki "Hello" yu işaret eder
        String str3="hello";  // literal way  ---> Heap Memory  ---> String Pool

        String str4=new String("Hello"); // String object -->  Heap Memory
        boolean bl;
        // System.out.println(bl);   // Local variable initialize etmediğimiz için hata verir
        bl= str1==str2;  //true
        System.out.println("bl = " + bl); //true
        System.out.println("-------------------------------");

        bl=str1.equals(str2);
        System.out.println("bl = " + bl); //true
        System.out.println("-------------------------------");

        bl=str1.equals(str3);
        System.out.println("bl = " + bl); //false
        System.out.println("-------------------------------");

        bl= str1==str4;
        System.out.println("bl = " + bl);// false
        bl=str1.equals(str4);
        System.out.println("bl = " + bl);// true equals sadece string içeriğini karşılaştırır

    }

}
