package day02_MyfirstProgram.src.day24_StringClass_Cont.tasks;

public class Task_03 {
    public static void main(String[] args) {
        String isim = "HAYRETTİN";
        String soyisim = "İHTİYAR";
        System.out.println(ilkHarfiAt(isim, soyisim));
    }

    /**
     * İsminizin baş harfi soy adınızda varsa soy adınızı isminizin baş harfinden arındırıp yazdıran bir method
     */
    public static String ilkHarfiAt(String isim, String soyisim) {
        if (soyisim.contains(isim.substring(0,1))) {
            String result = soyisim.replace(isim.substring(0,1), "");
            return result;
        } else {

            return "İsminizin baş harfi soyisminizde bulunmuyor.";
        }

    }
}
