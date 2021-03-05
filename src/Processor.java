public class Processor extends Runnable{
   
    private int id;

    public Processor(int id) {
        this.id = id;
    }
    public void run() {
        while(running)
        {
            System.out.println("hello");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
    public void shutdown() {
        running = false;
    }
}
