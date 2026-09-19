abstract class Vehicle{ // abstract class
    abstract void start(); // abstract method
    void stop(){
        System.out.println("Vehicle stops.");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start(){
        System.out.println("Bike starts with a button.");
    }
}


public class abstracts {
    public static void main(String[] args){
        Car c = new Car();
        c.start();
        c.stop();
        System.out.println();
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
