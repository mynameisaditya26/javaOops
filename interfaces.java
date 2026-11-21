interface Animal{
    int a = 10;
    void swim();
    void fly();
}

class Duck implements Animal{
    public void swim(){
        System.out.println("Duck can swim");
    }
    public void fly(){
        System.out.println("Duck can fly");
    }
}

public class interfaces {
    public static void main(String args[]){
        Duck d = new Duck();
        d.swim();
        d.fly();
        System.out.println(Animal.a);
    }
}