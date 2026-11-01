package W05.mine;
import java.util.Scanner;
public class W05L04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = in.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        // Jan + Feb + Mar + Apr = 31 + 28 + 31 + 30 = 120, plus 1 in a leap year
        int daysBeforeMay = leap ? 121 : 120;
        // May + Jun + Jul = 31 + 30 + 31 = 92
        int daysBeforeAugust = daysBeforeMay + 92;

        for (int month = 1; month <= 2; month++){
            String name = (month == 1) ? "May" : "August";
            int daysBefore = (month == 1) ? daysBeforeMay : daysBeforeAugust;
            int startDay = (firstDay + daysBefore) % 7;

            System.out.println();
            System.out.println(name + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            // blank cells before the 1st
            for (int i = 0; i < startDay; i++){
                System.out.print("    ");
            }
            // May and August both have 31 days
            for (int day = 1; day <= 31; day++){
                System.out.printf("%3d ", day);
                if ((startDay + day) % 7 == 0){
                    System.out.println();
                }
            }
            if ((startDay + 31) % 7 != 0){
                System.out.println();
            }
        }
        in.close();
    }
}
