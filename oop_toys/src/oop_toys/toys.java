package oop_toys;

public class toys {
//    cach 1
//    String jump = "is jumping";
//    String swim = "is swimming";
//    String run = "is running";
//    String sing = "is singing";
//    String bark = "is barking";
//    String fly ="is flying";

//    cach 2
    String type;
    public toys(String type){
        this.type = type;
    }
    public void jump(){
        System.out.println("The "+ this.type + " is jumping");
    }
    public void run(){
        System.out.println("The "+ this.type + " is running");
    }
    public void bark(){
        System.out.println("The "+ this.type + " is barking");
    }
    public void fly(){
        System.out.println("The "+ this.type + " is flying");
    }
    public void singing(){
        System.out.println("The "+ this.type + " is singing");
    }
    public void swim(){
        System.out.println("The "+ this.type + " is swimming");
    }

}
