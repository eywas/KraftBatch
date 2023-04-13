package day02_MyfirstProgram.src.day33_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {

        // In a char[] write all the alphabet in reversed order
        char[] alphabet;
        alphabet=new char[26];

       // alphabet[0]='Z';  //90 ASCII code

        char ch='Z';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabet));
        ch='A';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch++;

        }
        System.out.println(Arrays.toString(alphabet));
        }

    }

