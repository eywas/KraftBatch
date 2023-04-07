package day02_MyfirstProgram.src.day23_String_Class;


public class Homework_04 {
    public static void main(String[] args) {

        String str="   Merhaba Çocuklar      ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println("---------------------------------------");
        String tarih="18/10/2022 20:50:55";
        System.out.println(tarih);
        System.out.println(tarih.replace("/", "").replace(" ", "").replace(":", ""));


    }
}
