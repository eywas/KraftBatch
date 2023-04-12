package day02_MyfirstProgram.src.day26_String_Lab;

import java.util.Scanner;

public class Task_20_ArdiArdinaTekrarEdenHarfler {
    public static void main(String[] args) {

        System.out.println(ardiArdinaTekrarEdenHarfler("aabcccseeeeeefff"));
        System.out.println(ardiArdinaTekrarEdenHarfler("abaccb"));
        System.out.println(ardiArdinaTekrarEdenHarfler("Arsiz"));
        harf();

    }

    // Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.
    // aabccccseeeeeefff acef
    // abaccb c
    // Arsız ardı ardına tekrar eden harf yoktur amannsız n

    public static String ardiArdinaTekrarEdenHarfler(String str) {
        String result = "";
        while (str.length() > 1) {
            if (str.substring(0, 1).equals(str.substring(1, 2))) {
                result += str.substring(0, 1);

            }
            str = str.replace(str.substring(0, 1), "");

        }
        return result;

    }

    // en fazla geçen harf
    public static void harf() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        scanner.close();

        char maxHarf = ' ';
        int maxSayi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            int sayac = 0;
            for (int j = i; j < kelime.length(); j++) {
                if (kelime.charAt(j) == harf) {
                    sayac++;
                }
            }
            if (sayac > maxSayi) {
                maxSayi = sayac;
                maxHarf = harf;
            }
        }
        System.out.println("En fazla geçen harf: " + maxHarf);
    }
    }

