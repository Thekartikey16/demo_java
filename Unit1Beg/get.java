class Demo1{
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
    
}
public class get {
    public static void main(String[] args) {
        Demo1 D = new Demo1();
        D.setR(20);
        int ress = D.getR();
        System.out.println(ress);

    }
}
