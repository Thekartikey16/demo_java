import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = S.nextInt(); 
        System.out.println("Enter the second number:");
        int num2 = S.nextInt(); 

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        
        S.close(); 
    }
}