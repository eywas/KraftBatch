package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_05 {
    public static void main(String[] args) {
        String k1 = "Haydi";
        String k2 = "Gidelim";
        System.out.println(onArkaYazdir(k1, k2));
    }
    /**
     * Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna ekleyen bir method
     *
     * @param k1
     * @param k2
     * @return
     */
    public static String onArkaYazdir(String k1, String k2) {

        if (k1.length() > k2.length()) {

            String result = k2.concat(" "+k1.concat(" "+k2));
            return result;
        } else {
            String result = k1.concat(" "+k2.concat(" "+k1));
            return result;
        }
    }
}
