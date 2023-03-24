package day02_MyfirstProgram.src.day08_ScannerAndOperators;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {
    String fullName= "Ali ÖZTÜRK";


    String firstLetter ="A";
    char firstLetter2 ='B';

// primitive data türünde variable alrsadece data taşır.
        //nonprimitive data türünde ise hem değer taşır hem de methodları var.

        //System.out.println((firstLetter.toLowerCase());
        String metin = "şlkölşmiöşklişlkiş"+"lkjlkjlkjlkjlkjljk"+
                "lkjlkjşlnkujlkjnklj\n"+fullName+"\nçömçmçömöçmklmöçmçkklm"
                +firstLetter+"hkjhkjhnklhkjhlkjhlkjh" +firstLetter2;
        System.out.println(metin);

        String not = "not";
        String Not = "Variable isimlerine büyük harfle başlamak atvsiye edilmez, ama java bunu kabul eder.";
        String nOT = "Bir kere declare ettiğim bir değişkeni tekrar declare edemiyorum";
        String noT = "ama isimlerfarklı olursa java bunları farklı değişkenler olarak kabul eder.";


        // name convention: değişken isimleri küçük harfle başlar, sonraki kelimeler bitişik ve büyük harfle başlar
        //fullName, firstName, ogrenciAdi, okulNumarası;
        //camelCase
        //CamelCase classlarda bu şekilde kullanıyoruz.

    }
}
