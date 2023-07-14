import chapter17.Flyable;

public class Main {
    public static void main(String[] args) {

        Flyable plane = () -> {
            System.out.println("the plane can fly");
        };
            plane.fly();

        Flyable bird = () ->{
            System.out.println("the bird can fly");
        };
        bird.fly();


        Flyable duck = ()->{
            System.out.println("duck,,,duck,,fly");
        };
        duck.fly();

    }



}