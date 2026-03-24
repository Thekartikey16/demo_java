class StaticExample{
    void normal(){
        System.out.println("iam in normal method");

    }
    static void display(){
        show();
        System.out.println("iam in static display");
    }
    static void show(){
        System.out.println("iam in static show");
    }
}
public class main5 {
    public static void main(String[] args) {
        StaticExample SE= new StaticExample();
        System.out.println(SE);
        // SE.normal();
        StaticExample.show();
    }
    
}
