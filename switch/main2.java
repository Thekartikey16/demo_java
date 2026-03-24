import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int r = s.nextInt();
        int res = switch(r) {
            case 1->100;
            case 2->200;
            case 3->300;
            case 4->400;
            default->0;
        };
        System.out.println("The result is: " + res);
        s.close();
    }
}