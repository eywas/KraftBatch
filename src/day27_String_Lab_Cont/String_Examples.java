package day02_MyfirstProgram.src.day27_String_Lab_Cont;

import java.util.Scanner;

public class String_Examples {
    public static void main(String[] args) {

    }
    // Soru 1) //Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
    // 3 kelimeden az ise inputu döndüren bir metot yazınız.

    public static String ilkUcHarfGetir(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    // Soru 2) Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukSilYuzdeEkle(String str) {

        return str.replace(" ", "%");
    }

    // Soru 3) Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.

    public static String ikinciYari(String str) {

        return str.substring(str.length() / 2);
    }

    // Soru 4) Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri alan ve buna göre
    // kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.

    public static String ilkKelimeDegistir(String str, String eski, String yeni) {

        return str.replaceFirst(eski, yeni);
    }

    // Soru 5) Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String adetKadarYazdir(String str, int adet) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // Soru 6) Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimede istenen karakterin kaç adet olduğunu
    // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)

    public static int karakterSay(String str, String hedef) {
        str = str.toLowerCase();
        hedef = hedef.toLowerCase();
        int startLength = str.length();
        int finalLength = str.replace(hedef, "").length();
        return startLength - finalLength;
    }

    // Soru 7) Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi kaldırılmış şekilde
    // string döndüren programı yazınız.

    public static String karakterSil(String str, String ch) {

        String result = str.replace(ch, "");
        return result;
    }

    // Soru 8) Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün

    public static boolean hedefKelimeVarMi(String str, String hedefKelime) {
        String str2 = str.toLowerCase();

        if (str2.substring(0, hedefKelime.length()).contains(hedefKelime)) {
            return true;
        }
        return false;
    }

    // Soru 9) Kullanıcıdan 2 kelime alın örneğin kısa kelimeyi başta 2 defa uzun kelimeyi ortada 30 defa
    // kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String kisaUzunYaz(String str1, String str2, int ilkDongu, int ortaDongu, int sonDongu) {
        String result = "";
        if (str1.length() < str2.length()) {

            for (int i = 0; i < ilkDongu; i++) {
                result += str1;
            }

            for (int i = 0; i < ortaDongu; i++) {
                result += str2;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str1;
            }
        } else {
            for (int i = 0; i < ilkDongu; i++) {
                result += str2;
            }

            for (int i = 0; i < ortaDongu; i++) {
                result += str1;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str2;
            }
        }
        return result;

    }

    // Soru 10) Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    public static String karaktereYuvarla(String str, int number, char karakter) {
        if (str.length() >= number) {
            return str.substring(0, number);
        }
        for (int i = str.length(); i < number; i++) {
            str += karakter;
        }
        return str;

    }

    // Soru 11) Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    // almıyorsa false yazdırın.
    public static boolean ilkIkiSonIki(String str) {
        str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));
        return true;
    }

    // Soru12) Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..( soyad ).. dır ." Yazan metodu yazdırın

    public static String sonKelimeBul(String str) {
        str = str.trim();
        return str.trim().substring(str.lastIndexOf(" ") + 1);
    }

    //Soru 13)  Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    public static String yinelenenKarakteriCikar(String str) {
        str = str.replace(" ", "");
        String result = "";
        for (; str.length() > 0; ) {
            if (str.indexOf(str.substring(0, 1)) != str.lastIndexOf(str.substring(0, 1)))
                result += str.substring(0, 1);
            str = str.replace(str.substring(0, 1), "");

        }
        return result;
    }

    //Soru 14: Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak return eden methot yazınız.

    public static String yinelenenKelimeler(String str, String hedef){
        String result="";

        return result;
    }

    //Soru 15: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.

    public static String unluUnsuzYazdir(String str, String hedef){
        String result="";

        return result;
    }

    //Soru 16) Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    public static String ilkHarfleriSonaEkle(String str, int karakterSayisi) {
        if (str == null) return null;
        if (str.length() < karakterSayisi) return "Kelimenin karakter sayısı girilen sayıdan az olamaz.";
        str = str.trim();
        return str.replace(str.substring(0, karakterSayisi), "").concat(str.substring(0, karakterSayisi));
    }

    //Soru 17) Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.

    public static String sonHarfleriBasaEkle(String str, int karakterSayisi) {
        if (str == null) return null;
        if (str.length() < karakterSayisi) return "Kelimenin karakter sayısı girilen sayıdan az olamaz.";
        str = str.trim();
        return str.substring(str.length() - karakterSayisi, str.length()).concat(str.replace(str.substring(str.length() - karakterSayisi, str.length()), ""));
    }

    // Soru 18) Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük küçük harf gözardı edilecek.)
    // Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    public static String ilkBenzersizHarf(String str) {
        str = str.toLowerCase().trim();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result = ch + "";
                break;
            } else {
                result = "Benzersiz harf yoktur.";
            }
        }
        return result;
    }

    //Soru 19) Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa
    // (her harf eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true
    // oluşmuyorsa false yazdırın. (anagram kelime ise)

    public static boolean ikiKelimeAyniMi(String str1, String str2) {

        String str1new = str1.toLowerCase();
        String str2new = str2.toLowerCase();

        if (str1new.length() != str2new.length()) {
            return false;
        }
        for (int i = 0; i < str1new.length(); i++) {

            int index = str2new.indexOf(str1new.charAt(i));

            if (index == -1) {

                return false;
            }
            str2new = str2new.substring(0, index) + str2new.substring(index + 1);
        }
        return true;
    }

    // Soru 20) Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.

    public static String ardiArdinaTekrarEdenHarfler(String str) {
        String result = "";
        while (str.length() > 1) {
            if (str.substring(0, 1).equals(str.substring(1, 2))) {
                result += str.substring(0, 1);

            }
            str = str.replace(str.substring(0, 1), "");

        }
        return result;

    }

    //Soru 21) Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi girdiğinde
    // hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin. Her kelime için
    // 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru giriş yaparsa 2 kelimeyi
    // arada boşluk olacak şekilde sadece concat () metodu ile birleştirerek yazdırın.

    public static void checkAndConcat(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime 1: ");
        String kelime1= scan.nextLine();
        System.out.print("Kelime 2: ");
        String kelime2=scan.nextLine();
        if (kelime1.length()>4||kelime2.length()>4||kelime1.length()!=kelime2.length()||kelime1.isEmpty()||kelime2.isEmpty()){
            for (int i = 1; i <=3; i++) {
                checkAndConcat();
                            }
        }else{
           kelime1.concat(" "+kelime2);
        }

    }

    // Soru 22) Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük küçük harf gözardı edilecek.)
    // Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    public static String ilkBenzersizHarf2(String str) {
        str = str.toLowerCase().trim();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result = ch + "";
                break;
            } else {
                result = "Benzersiz harf yoktur.";
            }
        }
        return result;
    }
    // Soru 23-24) Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise true
    // değil ise false döndüren metot yazınız.

    public static boolean tersiAyniMi(String word){
        String reverse = "";

        for (int i = word.length() - 1; 0 <= i; i--) {
            reverse= reverse.concat(word.substring(i, i+1));
        }
        if (reverse.equals(word)) {
            return true;
        }
        return false;

    }

    // Soru25)Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu ekrana yazdırın.

    public static int kacHedefVar(String str, String hedef) {
        str = str.toLowerCase();
        hedef = hedef.toLowerCase();
        int ilkUzunluk = str.length();
        int sonUzunluk = str.replaceFirst(hedef, "").length()-hedef.length()-1;

        return ilkUzunluk - sonUzunluk;
    }



    //  Soru 26 ) Bursa ile Ankara kelimeleri cümlenin içerisinde aynı sayıda dönüyorsa true
    //  farklı sayılarda dönüyorsa false yazdıran metodu yazınız.

    public static boolean ayniSayidaMi(String str, String kelime1, String hedef) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().contains(kelime1.toLowerCase())) {
                str = str.replaceFirst(kelime1, "");
                count1++;
            }
            if (str.toLowerCase().contains(hedef.toLowerCase())) {
                str = str.replaceFirst(hedef, "");
                count2++;
            }
        }
        if (count1 == count2 && count1!=0) {
            return true;
        }
        return false;
    }

    // Soru 27 Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false döndüren metodu yazdırın.

    public static boolean bununlaMiBitiyor(String str,  String hedef) {

       if (str.toLowerCase().endsWith(hedef.toLowerCase())) {
                return true;
            }

        return false;
        }

    // Soru 28) Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına yazarak
    // ekrana döndürün.(büyük küçük harfler göz ardı edilecek)




    // Soru 29) Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.

    public static char enCokBulunanHarf(String kelime) {

        char maxHarf = ' ';
        int maxSayi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            int sayac = 0;
            for (int j = i; j < kelime.length(); j++) {
                if (kelime.charAt(j) == harf) {
                    sayac++;
                }
            }
            if (sayac > maxSayi) {
                maxSayi = sayac;
                maxHarf = harf;
            }
        }
        return maxHarf;
    }
}
