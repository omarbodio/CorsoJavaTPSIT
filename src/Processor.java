
import java.util.concurrent.*;

class Processor implements Runnable{
    private CountDownLatch latch;
     

    public void run() {
        System.out.println("Started.");
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        //TODO: handle exception
            e.printStackTrace();
        }

        latch.countDown();

    }
}
class App {
    public static void main(String[] args) {
        
        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {

            executor.submit(new Processor(latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
    }
}


