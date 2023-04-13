package day02_MyfirstProgram.src.day33_Arrays_3;

import java.util.Arrays;

public class C04_Tasks {
    //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir element olacak şekilde
    // bir array a dönüştüren bir method yazın.
    public static void main(String[] args) {
        String str = "merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.toString(stringToArray(str)));
        System.out.println("-----------------------------------------");
        String str2 = "kaysı, armut, üzüm, çilek, nar";
        System.out.println(Arrays.toString(stringToArray2(str2)));
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(changeElements(str2)));
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(changeArray(str, 2)));
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(nKadarArray(5)));
        System.out.println("-----------------------------------------");
        int intArr2[]={1,2,3,4,5,18};
        System.out.println(maxMinOrtalama(intArr2));
    }

    //«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir element olacak şekilde
    // bir array a atın. Elementlerden 5 den az harfi olan varsa onun yerine armut atayın.
    public static String[] stringToArray(String str) {
        return str.split(" ");
    }

    public static String[] stringToArray2(String str) {
        String[] newStr = str.split(", ");
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].length() < 5) {
                newStr[i] = "armut";
            }
        }
        return newStr;

    }

    // elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir element olacak şekilde
    // bir array a atın. İlk ve son idexi swaping yapın.
    public static String[] changeElements(String str) {
        String[] newStr = str.split(", ");
        String temp = newStr[0];
        newStr[0] = newStr[newStr.length - 1];
        newStr[newStr.length - 1] = temp;

        return newStr;
    }

    // merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin harflerinden
    // bir array döndüren method yazın.
    public static String[] changeArray(String str, int sayi) {
        int newSayi = sayi - 1;
        String[] newStr = str.split(" ");
        String[] newStr2 = newStr[newSayi].split("");

        return newStr2;
    }

    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir biçimde
    // bir array içine yerleştirsin. n = 5 Exm : [0,1,2,3,4]

    public static int[] nKadarArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;

    }

    //Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını veren bir method yazın.
    public static double maxMinOrtalama(int[] arr) {
        double max = arr[0];
        double min=arr[0];
        double ortalama=0;


        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                max = arr[i];
            }
        } ortalama=(max+min)/2;
        return ortalama;
    }


}


