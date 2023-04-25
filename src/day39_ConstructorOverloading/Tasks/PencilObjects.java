package day02_MyfirstProgram.src.day39_ConstructorOverloading.Tasks;


public class PencilObjects {
    public static void main(String[] args) {

    Pencil pencil1 = new Pencil("siyah",10,true,true);
        System.out.println("pencil1.write() = " + pencil1.write());
        System.out.println("pencil1.delete() = " + pencil1.delete());

        Pencil pencil2 = new Pencil("mavi", 10, false,true);
        System.out.println("pencil2.write() = " + pencil2.write());
        System.out.println("pencil2.delete() = " + pencil2.delete());
    }
}
