package day02_MyfirstProgram.src.day25_Summary;

public class Homework_Trim {
    public static void main(String[] args) {
        String name="    Hayrettin    ";
        System.out.println(name);
        System.out.println(trim(name));

    }
       /**
     * trim gibi çalışan  ve string döndüren trim(String str) şeklinde bir metot
     * @param trim
     * @return
     */
    public static String trim(String trim){
        String result = trim.replace(" ", "");
        return result;
    }
}
