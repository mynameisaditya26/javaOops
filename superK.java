// class superK {
//     public static void main(String[] args){
//         child ob = new child();
//             ob.display();
//     }
// }

// class parent {
//     int x = 10;
// }

// class child extends parent {
//     int x = 20;
//     void display(){
//         System.out.println(x); // 20
//         System.out.println(super.x); // 10
//     }
// }

// ________________________________________________________

// class superK{
//     public static void main(String[] args){
//         child ob = new child();
//         ob.display();
//     }
// }

// class parent {
//     void display(){
//         System.out.println("Hello from parent class");
//     }
// }

// class child extends parent{
//     void display(){
//         System.out.println("Hello from child");
//         super.display();
//     }
// }

// _________________________________________________________

class superK {
    public static void main(String[] args) {
        child obj = new child();
    }
}

class parent {
    parent() {
        System.out.println("parent constructor");
    }
}

class child extends parent {
    child() {
        super();
        System.out.println("child constructor");
    }
}