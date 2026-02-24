interface Add {
    int sum(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

public class Calculator implements Add, Sub {
    public int sum(int a, int b) {
        return a + b; 
    }
    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println( c.sum(10, 5));
        System.out.println( c.sub(10, 5));
    }
}