package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_If {
    public static void main(String[] args) {
        // bir havuza girişte kullanıcıya 18 yaşında olup olmadığını sorun
        //18 yaşın altındaysa giremezsiniz şeklinde uyarı versin
        //18 ve üzerinde ise yanında bayan olup olmadığını yazın; bayan yoksa giremezsin
        //Bayan var ise yüzme bilip bilmediğini sorun bilmiyorsa giremesin
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınız: ");
        int yas= scan.nextInt();
        if (yas >= 18) {

            System.out.print("Yanınızda bayan var mı? Evet/Hayır");
            String yanit= scan.next();
            if(yanit.equals("Evet")) {
                System.out.print("Yüzme biliyor musunuz? Evet/Hayır");
                String yanit2 = scan.next();
                if (yanit2.equals("Evet")) {
                    System.out.println("Hoş geldiniz.");
                } else {
                    System.out.println("Yüzme bilmediğiniz için için giremezsiniz");
                }
            }
                else{
                System.out.println("Yanınızda bayan olmadığı için giremezsiniz");
            }

        }else {
            System.out.println("Giremezsiniz");
        }
    }
}
