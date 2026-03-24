import java.util.Scanner;
public class smain {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter a number");
        int r = S.nextInt();
        String dayName;

        switch (r) {
            case 1->dayName = "Monday";
            case 2->dayName = "Tuesday";
            case 3->dayName = "Wednesday";
            case 4->dayName = "Thursday";
            default->dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}