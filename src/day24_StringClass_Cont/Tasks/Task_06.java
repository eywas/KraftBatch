package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_06 {
    public static void main(String[] args) {
        String word = "Hayrettin";
        System.out.println(tersYaz(word));
    }

    /**
     * Girilen kelimeyi tersten yazdıran bir method
     * @param word
     * @return
     */
    public static String tersYaz(String word){
       String reverse="";
        for (int i = word.length() - 1; 0 <= i; i--) {
            reverse= reverse.concat(word.substring(i, i+1));
        }return reverse;
    }
}
