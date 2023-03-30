package day02_MyfirstProgram.src.day22_Class_And_Object_Memory;

public class Cars {
    public static void main(String[] args) {
        CarNew car1=new CarNew();
        car1.marka="Audi";
        car1.modelAdi="Q7";
        car1.beygir=200;

        CarNew car2=new CarNew();
        car2.marka="bmw";
        car2.modelAdi="1.16İ";
        car2.beygir=185;

        if (car1.beygir> car2.beygir){
            System.out.println(car1.marka+" "+car1.modelAdi+" "+car1.beygir);
        }else{
            System.out.println(car2.marka+" "+car2.modelAdi+" "+car2.beygir);
        }
    }


}


