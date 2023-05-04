package day02_MyfirstProgram.src.day24_StringClass_Cont.tasks;

public class Task_04 {
    public static void main(String[] args) {
        String isim = "HAYRETTİN";
        String soyisim = "İHTİYAR";
        System.out.println(nickName(isim, soyisim));

    }

    /**
     * İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname oluşturan bir method
     */
    public static String nickName(String isim, String soyisim) {
            String result = isim.substring(0,3).concat(soyisim.substring(soyisim.length()-3,soyisim.length()));
            return result;
        }
}
