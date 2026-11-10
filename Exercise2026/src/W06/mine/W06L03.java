package W06.mine;
import java.util.Random;
import java.util.Scanner;

public class W06L03 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int N = in.nextInt();
        for (int n = 0; n < N; n++){
            int[] hours = new int[7];
            int total = 0;
            System.out.printf("Working hour for employee {%d}: %n", n+1);
            for (int d = 0; d<7;d++){
                hours[d] = rand.nextInt(1, 9);
                System.out.println(hours[d]);
                total += hours[d];
            }
            System.out.println("Total hours for this employee:" + total);
            in.close();
        } 
    }
}
