package day02_MyfirstProgram.src.day23_String_Class;


import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üç kelime giriniz: ");
        String k1= scan.next();
        String k2= scan.next();
        String k3= scan.next();
        if (k1.length()>k2.length()&&k2.length()>k3.length()){
            System.out.println(k1.concat(" " + k2.concat(" " + k3)));
        } else if (k2.length()>k1.length()&&k1.length()>k3.length()) {
            System.out.println(k2.concat(" " + k1.concat(" " + k3)));
        }else if (k3.length()>k1.length()&&k1.length()>k2.length()) {
            System.out.println(k3.concat(" " + k1.concat(" " + k2)));
        }else if (k1.length()>k3.length()&&k3.length()>k2.length()) {
            System.out.println(k1.concat(" " + k3.concat(" " + k2)));
        }else if (k2.length()>k3.length()&&k3.length()>k1.length()) {
            System.out.println(k2.concat(" " + k3.concat(" " + k1)));
        }else {
            System.out.println(k3.concat(" " + k2.concat(" " + k1)));
        }

    }
}
