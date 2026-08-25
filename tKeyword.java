class Box {
    double width = 1;
    double height = 2;
    double depth = 3;

    // 1. Default Constructor
    Box() {
        System.out.println("Default Constructor Called");
        width = 10;
        height = 10;
        depth = 10;
    }

    // 2. Parameterized Constructor
    Box(double width, double height, double depth) {
        System.out.println("Parameterized Constructor Called");
        this.width = width;
        this.height = height;
        this.depth = depth;
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

public class tKeyword {
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