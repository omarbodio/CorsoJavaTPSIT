public class Processor extends Runnable{
   
    private int id;

    public Processor(int id) {
        this.id = id;
    }
    public void run() {
        System.out.println("Starting: " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Complete:" + id);
    }
    
}
