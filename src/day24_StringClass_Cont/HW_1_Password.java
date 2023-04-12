package day02_MyfirstProgram.src.day24_StringClass_Cont;

import java.util.Scanner;

public class HW_1_Password {
    public static void main(String[] args) {
        passCheck();
    }

    public static void passCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.print("User Name: ");
        String userName= scan.nextLine();
        System.out.print("Password: ");
        String password=scan.nextLine();
        if (userName.length()<3||password.length()<3||userName.isEmpty()||password.isEmpty()){
            for (int i = 0; i < 3; i++) {
                passCheck();
            }
        }else{
            System.out.println(userName.concat(password));
        }




    }
}
