public class Circle {

    public double x, y;
    public double r;

    public double circum(){
        return 2 * 3.14 * r;
    }

    public double area(){
        return 3.14 * r * r;
    }

    public void display(){
        System.out.println("Centre of circle = "+ x +"," + y );
        System.out.println("Circumference = " + circum());
        System.out.println("Area = " + area());
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.x = 2.0;
        c1.y = 3.0;
        c1.r = 5.0;
        c1.display();
    }
}