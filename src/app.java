import java.util.concurrent.*;
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

        System.out.println("ehi");
        
    }
}