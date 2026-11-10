package W06.mine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class W06L01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N number of students: ");
        int N = in.nextInt();
        int []scoreList = new int[N];
        for (int i =0; i < N; i++){
            scoreList[i] = rand.nextInt(101);
        }
        System.out.println(Arrays.toString(scoreList));
        int min = scoreList[0];
        int max = scoreList[0];
        int total = 0;
        for (int i = 0; i < 0; i++){
            if(scoreList[i] > max){
                max= scoreList[i];
            }
            if(scoreList[i]<min){
                min= scoreList[i];
            }
            total += scoreList[i];
        }
        System.out.println("Minumum score: " + min);
        System.out.println("Maximum score: " + max);
        System.out.println("Average score: " + total/N);

        in.close();
    }
}
