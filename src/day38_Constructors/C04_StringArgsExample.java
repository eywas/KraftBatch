package day02_MyfirstProgram.src.day38_Constructors;

public class C04_StringArgsExample {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("-------------------------------------------------");
        args[0]="İsa";
        args[1]="Musa";

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
