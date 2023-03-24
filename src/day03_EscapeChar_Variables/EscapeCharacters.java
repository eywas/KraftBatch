package day02_MyfirstProgram.src.day03_EscapeChar_Variables;

public class EscapeCharacters {
    public static void main(String[] args) {
        // \n yazınca yeni satır açıyor
        // \t yazınca bir tab boşluk bırakıyor
        // \b yazınca backspace
        // \" yazınca "
        // \\ yazınca \
        // \r yazınca yazıldığı yerden satırbaşına kadar olan karakterleri siler
        System.out.println("Merhaba Dünya!");
        System.out.println("Merhaba \t Dünya!");
        System.out.println("Merhaba\bDünya\b");
        System.out.println("Merhaba\"Dünya\"");
        System.out.println("Merhaba\\Dünya");
        System.out.println("Merhaba\rDünya");
    }
}
