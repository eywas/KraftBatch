package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_08 {
    public static void main(String[] args) {
        String isim = "Hayrettin";
        System.out.println(isim);
        sonUcHarf(isim);
    }
    /**
     * İsmin son üç harfini üç kere yazdıran metod
     * @param ad
     * @return
     */
    public static String sonUcHarf(String ad){
       String sonUc="";
        for (int i = 0; i < 3; i++) {
            sonUc=ad.substring(ad.length()-3,ad.length());
            System.out.println(sonUc);
        }return sonUc;
    }
}
