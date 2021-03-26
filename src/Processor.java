import java.util.concurrent.CountDownLatch;

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
class App extends {
    public static void main(String[] args) {
        
        CountDownLatch latch = new CountDownLatch(3);
        
    }
}


