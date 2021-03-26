
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



