import java.util.Scanner;
interface Shape{
    double area(double r);
}
public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double R = s.nextDouble();
        Shape S = (r) -> Math.PI* r * r;
        double res = S.area(R);
        System.out.println(res);
        s.close();
    }
}