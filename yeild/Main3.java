class Class1 extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println( i);
        }
    }

    class Class2 implements Runnable {
        public void run() {
            for(char a='a'; a<'f'; a++) {
                System.out.println(a);
            }
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        c1.start();

        Class1.Class2 c2 = c1.new Class2();
        Thread t2 = new Thread( c2);
        t2.start();
    }
}