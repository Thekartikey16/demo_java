interface Sample2{
    void display();
}
public class Main5{
    public static void main(String[] args) {
        Sample2 S = ()->System.out.println("iam in display");
         S.display();
    }
}
