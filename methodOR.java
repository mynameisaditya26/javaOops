public class methodOR {
    public static void main(String[] args){
        Human h = new Dog();
        h.sound();
        h.eat();
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}

class Human{
    void sound(){
        System.out.println("Alphanumeric");
    }
    void eat(){
        System.out.println("Human eats");
    }
}

class Dog extends Human{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
    @Override
    void eat(){
        System.out.println("Dog is eating");
    }
}


