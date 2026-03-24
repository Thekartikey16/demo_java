class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, double b) {
        return a + b;
    }
}

public class methoverloading {
    public static void main(String[] args) {
        MathOperation o = new MathOperation();
        int r = o.add(10, 20);
        System.out.println(r);
        double r2 = o.add(2, 2.3);
        System.out.println(r2);
        // System.out.println(o.add(10, 20));
        // System.out.println(o.add(10, 20, 30));
        // System.out.println(o.add(2, 3.5));
    }
}
