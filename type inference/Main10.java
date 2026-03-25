interface Sample3{
    default void display(){
        System.out.println("iam in display");
    }
    static void show(){
        System.out.println("iam in show");
    }
}
public class Main10 implements Sample3{
    public static void main(String[] args) {
        Main10 c = new Main10();
        c.display();
        Sample3.show();
    }
    
}
