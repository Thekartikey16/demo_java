class Sample implements Runnable{
    public void run() {
            System.out.println("Started"+Thread.currentThread());
            Thread.yield();
            System.out.println("Stopped"+Thread.currentThread());
    }
}
public class main4 {
    public static void main(String[] args) {
        Sample s = new Sample();
        Sample s1 = new Sample();
        Thread t = new Thread(s,"first Thread ");
        Thread t1 = new Thread(s1,"second Thread");
        t.setPriority(4);
        t1.setPriority(10);
        t1.start();
        t.start();
    }
}
