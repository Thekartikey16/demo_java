interface Sample{

    void display();
}
public class aMain3 implements Sample{
    public void display(){
        System.out.println("iam in display in class main");
    }
    public static void main(String[] args) {
        aMain3 c = new aMain3();
        c.display();
    }
    
}
