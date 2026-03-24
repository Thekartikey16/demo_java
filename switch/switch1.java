import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter a number");
        int day = S.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}