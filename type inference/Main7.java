interface D{
    // String name = "Kartikey";
    void display(int a , int b);
}
public class Main7 {
    public static void main(String[] args) {
        D c = (a, b) -> System.out.println(a + b);
        c.display(5, 10);
    }
    
}
