interface A{
    // String name = "Kartikey";
    void display(String name);
}
public class Main6{
    public static void main(String[] args) {
        A c = (name) -> System.out.println("name: " + name);
        c.display("Kartikey");
    }
    
}
