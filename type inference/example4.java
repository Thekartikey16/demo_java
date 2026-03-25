interface Sample5 {
     void display();
}

public class example4{
    static int a = 10;
        void show(){
            Sample5 s = () -> System.out.println(a);
            s.display();
        }
    public static void main(String[] args) {
        example4 e = new example4();
        e.show();}

    }

