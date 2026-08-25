class Box {
    double width;
    double height;
    double depth;

    // 1. Default Constructor
    Box() {
        System.out.println("Default Constructor Called");
        width = 10;
        height = 10;
        depth = 10;
    }

    // 2. Parameterized Constructor
    Box(double w, double h, double d) {
        System.out.println("Parameterized Constructor Called");
        width = w;
        height = h;
        depth = d;
    }

    // 3. Copy Constructor
    Box(Box obj) {
        System.out.println("Copy Constructor Called");
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        // Using Default Constructor
        Box myBox1 = new Box();

        // Using Parameterized Constructor
        Box myBox2 = new Box(5, 6, 7);

        // Using Copy Constructor
        Box myBox3 = new Box(myBox2);

        System.out.println();

        System.out.println("Volume of Box 1 = " + myBox1.volume());
        System.out.println("Volume of Box 2 = " + myBox2.volume());
        System.out.println("Volume of Box 3 = " + myBox3.volume());
    }
}