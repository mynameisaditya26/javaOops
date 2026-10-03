class Task1 extends Thread{
    @Override 
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Task 1 : " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}

class Task2 extends Thread{
    @Override 
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Task 2 : " + i);
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class multiThreading {
    public static void main(String[] args){
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();

        System.out.println("Thread running...");
    }
}
