class student{
    int r;
    String name;
    static String College = "ABES";
    static int count = 0;
    void getdata(int r,String name){
        this.r = r;
        this.name = name;
        count++;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
        System.out.println(College);
        System.out.println(count);
    }
}
public class ABC {
    public static void main(String[] args) {
        student S = new student();
        S.getdata(1, "kartikey");
        System.out.println(student.count);
        S.display();
        System.out.println(student.College);
        student S1 = new student();
        S1.getdata(10 , "Amit");
        System.out.println(student.count);
    }
}
