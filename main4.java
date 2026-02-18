class student{
    int r = 10 ;
    static String name ="kartikey";
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
    static void show(){
        // System.out.println(r);
        System.out.println(name);
    }
}
public class main4 {
    public static void main(String[] args) {
        student S =new student ();
        S.display();
        student.show();
    }
}
