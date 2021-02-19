import java.util.*;
import System.*;


public class App {

    public static void main(String[] args) throws Exception{
        Processor proc1 = new Processor();
        proc1.start();
        Scanner
        System.out.println("press return to stop...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc1.shutdown()
    }
}

/*private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doWork();       
    }

    public void doWork() {

        Thread t1 = new Thread(new Runnable(){
            public void run(){

                for(int i = 0; i < 10000; i++){
                    increment();
                }
            } 
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                
                for(int i = 0; i < 10000; i++){
                    increment();
                }
            } 
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }       

        System.out.println("Count is: " + count);*/