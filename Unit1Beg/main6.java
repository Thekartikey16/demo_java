class Demo{
    private int r;
    private String name;
    void getdata(int r ,String name){
        this.r = r;
        this.name = name;
    }
    void show(){
        System.out.println(r);
        System.out.println(name);

    }
}
public class main6 {
    public static void main(String[] args) {
        Demo D = new Demo();
        D.getdata(10, "kartikey");
        D.show();
    //     D.r = 10;
    //     D.name = "kartikey";
    //     System.out.println(D.r);
    //     System.out.println(D.name);
    }

}
