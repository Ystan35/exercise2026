package W05.mine;
import java.util.Scanner;
public class W05L03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double avg, std;
        int count = 0, sumX2 = 0;
        System.out.print("Enter a score(negative score to quit): ");
        int n = in.nextInt();
        while (n>=0){
            sum += n;
            count++;
            sumX2 += n * n;
            if (n < min){
                min = n;
            }
            if (n > max){
                max = n;
            }
            System.out.print("Enter a score(negative score to quit): ");
            n = in.nextInt();
        }
        if (count > 0){
            avg = (double) sum / count;
            System.out.println(((double) sumX2 - ((double) sum * sum / count))/ (count-1));
            std = Math.sqrt(((double) sumX2 - ((double) sum * sum / count)) / (count-1));
            System.out.println("Minimum score: " + min);
            System.out.println("Maximum score: " + max);
            System.out.printf("Average score: %.2f\n",  avg);
            System.out.printf("Standard deviation: %.2f%n", std);
        } else {
            System.out.println("No valid scores entered.");
        }
        in.close();
    }
}
