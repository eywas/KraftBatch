package day02_MyfirstProgram.src.day16_Branching_Statements;

public class Task {
    public static void main(String[] args) {
        //0ile 100 arasındaki 30ile 50 arası hariç sayıları yazdırın
        for (int i = 0; i <= 100; i++) {

            if (i>30&&i<50){
                continue;

            }

            System.out.print(i+" ");
        }
        System.out.println("----------------------------------");
        for (int i = 0; i <= 100; i++) {

            if (!(i%13==0)){
                continue;

            }

            System.out.print(i+" ");

    }
}
}
