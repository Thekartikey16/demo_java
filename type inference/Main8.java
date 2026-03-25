interface E{
    // String name = "Kartikey";
    int sum(int a , int b);
}
public class Main8 {
    public static void main(String[] args) {
        E c = (int a,int b) -> {return(a+b);};
        int res= c.sum(5, 10);
        System.out.println( res);
    }
    
}
