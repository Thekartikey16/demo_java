interface A{
    // String name = "Kartikey";
    void display(String name);
}
public class Main3 implements A{
    public void display(String name){
        System.out.println("name:"+name);
    }
    public static void main(String[] args) {
        Main3 c = new Main3();
        c.display("Kartikey");
    }
    
}
