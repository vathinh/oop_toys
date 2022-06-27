package oop_toys;

public class Main {
    public static void main(String[] args) {
// cach 1
//        fish Fish = new fish();
//        dog Dog = new dog();
//        bird Bird = new bird();
//
//        Fish.fishSwim();
//        System.out.println();
//
//        Dog.dogJump();
//        Dog.dogBark();
//        Dog.dogRun();
//        System.out.println();
//
//        Bird.birdFly();
//        Bird.birdJump();
//        Bird.birdSing();


//        cach 2
    toys Dog = new toys("Dog");
    toys Bird =new toys("Bird");
    toys Fish =new toys("Fish");
    Dog.jump();
    Dog.run();
    Dog.bark();
    System.out.println();

    Bird.fly();
    Bird.jump();
    Bird.singing();
    System.out.println();

    Fish.swim();
    }
}
