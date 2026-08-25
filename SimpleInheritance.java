class A{
    int i, j;
    void showij(){
        System.out.println("i and j = " + i + j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k = " + k);
    }
    void sum(){
        System.out.println(" i + j + k = " + (i + j + k));
    }
}

class SimpleInheritance{
    public static void main(String args[]){
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}