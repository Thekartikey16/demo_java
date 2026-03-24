class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1 is running");
    }
}
class example implements Runnable {
    public void run() {
        System.out.println("example is running");
    }
}
public class main2 {
    public static void main(String[] args) {
        example ex = new example();
        Thread t2 = new Thread(ex);
        t2.start();
    }
}