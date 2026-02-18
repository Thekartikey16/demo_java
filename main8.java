class Student{
    int r ;
    String name;
    Student(int r , String name){
        r = 0;
        name = null;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
}
public class main8 {
    public static void main(String[] args) {
        Student S = new Student(1, "Kartikey");
        S.display();
    }
}
