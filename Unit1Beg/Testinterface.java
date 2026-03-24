interface A {
    public void show();
}

public class Testinterface implements A {
    public void show() {
        System.out.println("hello");
    }

    public void print() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        A t1 = new Testinterface();
        t1.show(); 
        Testinterface t2 = new Testinterface();
        t2.print(); 
    }
}