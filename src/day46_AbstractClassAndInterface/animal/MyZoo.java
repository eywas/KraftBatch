package day02_MyfirstProgram.src.day46_AbstractClassAndInterface.animal;

public class MyZoo {
    public static void main(String[] args) {


        Cat cat = new Cat("Minnoş", "Scottish", 'M', 5, "Medium", "Gray");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setAge(0);
        System.out.println(cat);
        cat.setSize("Large");
        cat.setName("Black");
        System.out.println(cat);
    }
}
