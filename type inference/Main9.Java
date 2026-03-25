interface A{
    // String name = "Kartikey";
    String display(String name);
}
public class Main9{
    public static void main(String[] args) {
        String str = "hola";
        A c = (name) ->{return str+ " " +name;};
        String res = c.display("Kartikey");
        System.out.println(res);
    }
    
}
