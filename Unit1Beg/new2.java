class Demo2{
    private int r;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }
}

public class new2{
    public static void main(String[] args) {
        Demo2 D = new Demo2();
        D.setR(20);
        D.setName("kartikey");
        int ress = D.getR();
        String res = D.getName();
        System.out.println(ress);
        System.out.println(res);

    }
}
