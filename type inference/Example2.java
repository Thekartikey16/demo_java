interface Sample4{
    void display();
}

public class Example2 {
    int a;
        Example2(int a){
                this.a = a;
        }
        void show(){
            Sample4 s = () -> System.out.println(a);
            s.display();
        }
    public static void main(String[] args) {
        Example2 e = new Example2(10);
        e.show();

    }
}


