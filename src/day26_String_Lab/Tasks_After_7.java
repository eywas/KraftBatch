package day02_MyfirstProgram.src.day26_String_Lab;

public class Tasks_After_7 {
    public static void main(String[] args) {
        String kelime1 = "Kafka";
        String kelime2 = "Tutma";
        System.out.println("ikiKelimeAyniMi(\"elif\",\"File\") = " + ikiKelimeAyniMi("elif", "File"));

    }

    // Soru 8: Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün
    public static boolean kinVarMi(String str) {
        String str2 = str.toLowerCase();
        if (str2.substring(0, 4).contains("kin")) {
            return true;
        }
        return false;
    }

    // Soru 9: Kullanıcıdan 2 kelime alın kısa kelimeyi başta 2 defa uzun kelimeyi ortada 30 defa
    // kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    public static void kisaUzunYaz(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.print(str2 + str2);
            for (int i = 0; i < 30; i++) {
                System.out.print(str1);
            }
            System.out.print(str2 + str2);
        } else {
            System.out.print(str1 + str1);
            for (int i = 0; i < 30; i++) {
                System.out.print(str2);
            }
            System.out.print(str1 + str1);
        }
    }

    // Soru 10: Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    public static String beseYuvarla(String str) {


        if (str.length() == 4) {
            return str;
        } else if (str.length() < 4) {
            for (int i = str.length(); i < 5; i++) {
                str = str.concat(".");
            }
            return str;
        } else {
            return str.substring(0, 5);
        }

    }

    // Soru 11: Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.
    public static boolean ilkIkiSonIki(String str) {
        str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));
        return true;
    }

    // Soru12 : Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..( soyad ).. dır ." Yazan metodu yazdırın

    public static String sonKelimeBul(String str) {
        str = str.trim();
        return str.trim().substring(str.lastIndexOf(" ") + 1);
    }

    //Soru 13:  Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
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

    //Soru 16: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    public static String ilkHarfleriSonaEkle(String str, int karakterSayisi) {
        if (str == null) return null;
        if (str.length() < karakterSayisi) return "Kelimenin karakter sayısı girilen sayıdan az olamaz.";
        str = str.trim();
        return str.replace(str.substring(0, karakterSayisi), "").concat(str.substring(0, karakterSayisi));
    }

    //Soru 17: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.

    public static String sonHarfleriBasaEkle(String str, int karakterSayisi) {
        if (str == null) return null;
        if (str.length() < karakterSayisi) return "Kelimenin karakter sayısı girilen sayıdan az olamaz.";
        str = str.trim();
        return str.substring(str.length() - karakterSayisi, str.length()).concat(str.replace(str.substring(str.length() - karakterSayisi, str.length()), ""));
    }

    // Soru 18: Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük küçük harf gözardı edilecek.)
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

    //Soru 19: Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false yazdırın. (anagram kelime ise)

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


}
