class Students3{
    int r;
    String name;

    Students3(int r , String name ){
        this.r = r;
        this.name = name;
    }
    void show(Students3 S){
        this.r = S.r;
        this.name = S.name;

    }
    void display(){
        System.out.println("Roll No.:"+r);
        System.out.println("Name:"+name);

    }
}
public class cons {
    public static void main(String[] args) {
        Students3 S3 = new Students3 (1,"kartikey");
        S3.display();
        Students3 S2 = new Students3 (0, null);
        // S2.display();
        S2.show(S3);
    }
}
