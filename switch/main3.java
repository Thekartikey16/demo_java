import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int r = s.nextInt();
        int res = switch(r) {
            case 1:
                yield 100;  
            case 2:
                yield 200;
            case 3:
                yield 300;
            case 4:
                yield 400;
            default:
                yield 0;
        };
        System.out.println("The result is: " + res);
        s.close();
    }
}