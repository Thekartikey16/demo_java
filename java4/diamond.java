interface AA {
    default void display(){
}
}
interface BB extends AA{ 
    default void display(){
        System.out.println("display in BB");
}
}
interface CC extends AA{
    default void display(){
        System.out.println("display in CC");
}
}
class program implements BB, CC{
    public void display(){
        CC.super.display();
        BB.super.display();
        System.out.println("display in program");

    }
}
public class diamond {
    public static void main(String[] args) {
        program p = new program();
        p.display();
    } 
}
