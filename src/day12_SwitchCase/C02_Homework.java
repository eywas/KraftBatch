package day02_MyfirstProgram.src.day12_SwitchCase;

public class C02_Homework {
    public static void main(String[] args) {
        //Bir program yazın. 3 tane numara kabul etsin ve büyük olanı versin.(homework)

      //  int x,y,z;
        //x=50;
        //y=60;
        //z=15;
        //System.out.println("En büyük sayı: "+(Math.max(Math.max(x,y),z))); //Bu birinci çözüm

       /* if((x>y)&&(x>z)){
            System.out.println("En büyük sayı "+x);
        } else if ((y>x)&&(y>z)) {
            System.out.println("En büyük sayı "+y);

        }else{
            System.out.println("En büyük sayı "+z);
        }

        */
        //3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız


        int x,y,z;
        x=50;
        y=60;
        z=70;
        if(x==y){
            System.out.println(x);
        }else if(x==z){
            System.out.println(x);
        }else if(y==z){
            System.out.println(y);
        }else{
            System.out.println("Eşit sayı yok");
        }
    }
}
