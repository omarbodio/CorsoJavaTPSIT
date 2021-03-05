public class Processor extends Thread{
    private boolean running = true;
    @Override
    public void run() {
        while(running)
        {
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        running = false;
    }
}
