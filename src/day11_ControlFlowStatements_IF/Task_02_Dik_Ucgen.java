package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

public class Task_02_Dik_Ucgen {
    public static void main(String[] args) {
        // Bir program yazın. 3açı kabul etsin. Açılardan biri 90 ise "Bu bir dik üçgendir." mesajı döndürsün

        int x, y, z;
        x=60;
        y=30;
        z=90;
        if ((x+y+z)==180){
            if(x==90||y==90|z==90){
                System.out.println("Bu bir dik üçgendir.");
            }else {
                System.out.println("Bu bir dik üçgen değildir.");
            }


        }else {
            System.out.println("Bu bir üçgen değildir.");
        }
    }
}

