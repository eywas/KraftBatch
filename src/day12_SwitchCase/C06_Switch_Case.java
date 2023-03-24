package day02_MyfirstProgram.src.day12_SwitchCase;

public class C06_Switch_Case {
    public static void main(String[] args) {
        // byte, short, int, String ve char tipindeki değerleri karşılaştırmak için kullanılır.(switch)
        //
        int sayi=3;
        switch (sayi){
            case 1:
                System.out.println("Sayı 1'e eşittir.");
                break;
            case 2:
                System.out.println("Sayı 2'ye eşittir.");
                break;
            case 3:
                System.out.println("Sayı 3'e eşittir.");
                break;
            default:
                System.out.println("Sayı eşleşmedi.");


        }
    }
}
