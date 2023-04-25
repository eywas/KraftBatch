package day02_MyfirstProgram.src.day39_ConstructorOverloading.Tasks;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat("kara","yeşil",'M',false,true);
        System.out.println("cat1.sleep() = " + cat1.sleep());
        System.out.println("cat1.food() = " + cat1.food());
        System.out.println("cat1.run() = " + cat1.run());

        Cat cat2 = new Cat("kül","gri",'F',false,true);
        System.out.println("cat2.sleep() = " + cat2.sleep());
        System.out.println("cat2.food() = " + cat2.food());

        Cat cat3 = new Cat("beyaz","mavi",'M',true,true);
        System.out.println("cat3.sleep() = " + cat3.sleep());
        System.out.println("cat3.food() = " + cat3.food());

        Cat cat4 = new Cat("minik","siyah",'M',false,true);
        System.out.println("cat4.sleep() = " + cat4.sleep());
        System.out.println("cat4.food() = " + cat4.food());
        System.out.println("cat4.run() = " + cat4.run());


    }
}
