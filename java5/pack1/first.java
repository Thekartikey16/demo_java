package pack1;
class example{
    void display(){
        System.out.println("display in example");
    }
}
public class first {
    public static void main(String[] args) {
        example e = new example();
        e.display();
    }
}
