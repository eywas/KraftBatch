package day02_MyfirstProgram.src.day15_If_Else_SWitch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {
        // Ali'nin cebinde 100 TL var ve zamanı var ise sinemaya gitsin
        // 100 TL yoksa evde kalsın
        int aliParasi=120;
        boolean zaman=false;

        if (aliParasi>=100){
            if (zaman){
                System.out.println("Sinemaya gidebilir.");
            }else{
                System.out.println("Parası var ama zamanı yok gidemez.");
            }
        }else{
            System.out.println("Parası yok gidemez");
        }
    }
}
