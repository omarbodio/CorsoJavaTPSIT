class Runner extend Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Hello "+1);

            try {
                Thread.sleep(100);
            } catch (InterruptedException) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

public class App{
    public static void main(String[] args) throws Exception {
        Runner runner = new Runner();
        runner.start();
    }
}