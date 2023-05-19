package day02_MyfirstProgram.src.day58_JavaReview3.abstractionReview;

public abstract class Car {
    public String brand, model, color;

//    public final void driver() {
//        System.out.println("ı am driving a " + color + " " + brand + " " + model);
//    }
    public abstract void driver();

    public abstract void start();  // these methods are not completed
                                   // all the child class must implement this method
                                   // can not private, final, static

    public abstract void stop();
}