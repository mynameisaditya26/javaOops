class isAliveAndJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class usingIsAliveAndJoin {
    public static void main(String args[])
            throws InterruptedException {
        isAliveAndJoin t1 = new isAliveAndJoin();
        isAliveAndJoin t2 = new isAliveAndJoin();
        t1.start();
        t2.start();
        System.out.println("T2 alive: " + t2.isAlive());
        System.out.println("T1 alive: " + t1.isAlive());
        t1.join();
        t2.join();
        System.out.println("T2 alive: " + t2.isAlive());
        }
}