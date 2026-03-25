interface B{
    // String name = "Kartikey";
    void display(int a , int b);
}
public class Main4 implements B{
    public void display(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Main4 c = new Main4();
        c.display(5, 10);
    }
    
}
