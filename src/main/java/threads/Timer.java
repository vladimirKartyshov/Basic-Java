package threads;

public class Timer implements Runnable{

    private String name;

    public Timer(String name) {
        this.name = name;
    }

    public void run() {

        for(int i=0; i<10; i++){
            System.out.println(name + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
