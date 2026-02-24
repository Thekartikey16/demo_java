class A{
    void show(){
        System.out.println("how in class A");
    }
}
interface B{
    void show();
}
interface C{
    void show();
}
class D extends A implements B,C{
    public void show(){
        System.out.println("Show in class D");
    }
}
public class hybridinterferance {
    public static void main(String[] args) {
      D d = new D();
      d.show();
    }
}
