interface A {
    int r=10;
    String name ="Hello";
}
interface B extends A {
    void display();
}
public class main3 implements B {
    public static void main(String[] args) {
        main3 p = new main3();
        p.display();
        System.out.println(main3.r);
    }
    public void display() {
        System.out.println(r);
        System.out.println(name);
    }
      
}
