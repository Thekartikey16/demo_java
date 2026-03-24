abstract class Calculator {
    abstract int add(int a, int b);
    abstract int sub(int a, int b);
    abstract int mul(float a, float b);
}

class Basic extends Calculator {
    int add(int a, int b) { return a + b; }
    int sub(int a, int b) { return a - b; }
    int mul(float a, float b) { return (int)(a * b); }
}

public class main3 {
    public static void main(String[] args) {
        Calculator c = new Basic();
        System.out.println(c.add(10, 5));
        System.out.println(c.sub(10, 5));
        System.out.println(c.mul(10, 5));
    }
}