package W05.mine;
import java.util.Scanner;
public class W05L07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter the interest rate in %: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the total number of month(s): ");
        int months = scanner.nextInt();

        double interestDue = 0, totalInterest = 0, principalDue = 0, monthlyPayment =0, remainingBalance = principal;
        System.out.println("Month\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        for (int month = 1; month <= months; month++){
            monthlyPayment = (principal *(interestRate/(12*100)))/(1-Math.pow(1+(interestRate/(12*100)), -months));
            principalDue = monthlyPayment * Math.pow((1+(interestRate/(12*100))), -(1+months-month));
            interestDue = monthlyPayment - principalDue;
            totalInterest += interestDue;
            remainingBalance -= principalDue;
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n", month, monthlyPayment, principalDue, interestDue, remainingBalance, totalInterest);
        }
        scanner.close();
    }
}
