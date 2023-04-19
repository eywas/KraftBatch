package day02_MyfirstProgram.src.day35_Arrays_Summary;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Example_Lab_3 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 6, 5, 4, 3};
        int[] intArr = {1, 20, 3, -400, 50, 6};
        int[] sayilar = {1, 2, -8, -9};
        int[] sayilar2 = {-1, 0, -7, 11};
        int[] sayilar3 = {-1, 0, -7};

        System.out.println(sumOfArrayElements(numbers));
        System.out.println("----------------------------");
        System.out.println(sumOfEvenElements(numbers));
        System.out.println("----------------------------");
        System.out.println(sumOfThrees(numbers));
        System.out.println("----------------------------");
        System.out.println(maxOfArray(intArr));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(minOfArray(intArr)));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(buildIntArray(8, 15)));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(uniteArray(sayilar, sayilar2)));
        System.out.println("----------------------------");
        System.out.println(tumSayilarVarMi(sayilar3, sayilar2));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(reversedArray(sayilar2)));
        System.out.println("----------------------------");
        rastgeleSayilar();
        System.out.println("----------------------------");
        rastgeleSayilarElliSeksen();
        System.out.println("----------------------------");
        System.out.println(rastgeleSayilarKacAdet(125));


    }

    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //    Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThrees(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i == 3) {
                sum += i;
            }
        }
        return sum;
    }

    // Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. ( Arrays.sort kullanılmayacak)

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.( Arrays.sort ve
    //Arrays.fill kullanılmayacak) [1,2,-8,-9] [ -9, -9, -9, -9]

    public static int[] minOfArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min;
        }
        return arr;
    }

    // Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    // createArray(8,15)  [8,9,10,11,12,13,14,15]

    public static int[] buildIntArray(int baslangic, int son) {
        int[] intArr = new int[son - baslangic + 1];
        for (int i = 0, j = baslangic; i < intArr.length; i++, j++) {
            intArr[i] = j;
        }
        return intArr;
    }

    // Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
    //oluşturan metodu yazınız. [1,2,-8,-9] [-1,0,-7,11] [1,2,-8,-9,-1,0,-7,11]

    public static int[] uniteArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i];

            } else {
                newArr[i] = arr2[j];
                //
                j++;
            }
        }
        return newArr;
    }

    //Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
    //yer almıyorsa false yazdıran metodu yazınız.
    //[5,4,3,2,1] , [1,2,3,4,5,7,9] true
    //[5,4,3,2,1,7,5] , [1,2,3,4,5] false
    public static boolean tumSayilarVarMi(int[] arr1, int[] arr2) {
       firstloop: for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i]==arr2[j]){
                    continue firstloop;
                }
            }
            return false;
        }
        return true;
    }

    //Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
    //[5,4,3,2,1]---------------> [1,2,3,4,5]

    public static int[] reversedArray(int[] arr){
        int[] yeniarr=new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            yeniarr[j] =arr[i] ;

            }return yeniarr;
        }

        //Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0 100 arasında
    //rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.

    public static void rastgeleSayilar(){
        Random random = new Random();
        int rastgele[] = new int[10];

        for (int i = 0; i < rastgele.length; i++) {
            rastgele[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(rastgele));
    }

    // Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50 80
    //arasında rasgele sayılar atayın.

    public static void rastgeleSayilarElliSeksen(){
        Random random = new Random();
        int rastgele2[] = new int[500];

        for (int i = 0; i < rastgele2.length; i++) {
            rastgele2[i] = random.nextInt(50,80);
        }
        System.out.println(Arrays.toString(rastgele2));
    }

    // Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120 140
    //arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerisinde kaç adet 125 sayısı vardır?

    public static int rastgeleSayilarKacAdet(int s){
        Random random = new Random();
        int rastgele3[] = new int[500];
        int total=0;

        for (int i = 0; i < rastgele3.length; i++) {
            rastgele3[i] = random.nextInt(120,140);
            }
        for (int i = 0; i < rastgele3.length; i++) {
            if (rastgele3[i]==s){
                total++;
            }
        }
        return total;
    }

    // Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120 140
    //arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
    //Array.sort kullanılmayacak)


    }


