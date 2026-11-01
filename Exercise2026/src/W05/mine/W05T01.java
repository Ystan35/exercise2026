package W05.mine;
import java.util.Random;
import java.util.Scanner;
public class W05T01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        // 1a
        int n = 1;
        int n_cube = 0;
        do{
            n_cube = n * n * n;
            n++;
        }while(n_cube < 2000);
        System.out.println("The smallest integer n such that n^3 < 2000 is " + (n-1));

        //1b
        int square = 0;
        for (int num =1; num < 13; num++){
            square = num * num;
            System.out.println("The square of " + num + " is " + square);
        }

        //1c
        for (int i =0; i < 4; i++){
            for (int j = 0; j< 5; j++){
                int random = rand.nextInt(101);
                System.out.printf("%4d ", random);
            }
            System.out.println();
        }
        //1d
        int sum = 0;
        System.out.print("Enter a integer: ");
        int target = in.nextInt();
        for (int i = 1; i <= target; i++){
            sum += i;
        }
        System.out.println("The sum of integers from 1 to " + target + " is " + sum);
        
        //1e
        double sum2 = 0;
        int a = 1;
        int b = 25;
        while(a<= 25){
            sum2 += (double)a/b;
            a++;
            b--;
        }
        System.out.printf("The sum of the fractions is %.2f", sum2);
    
                //2a
        // for (x = 10; x > 0; x--){
        //     sum += x;
        // }
        //2b
        // do{
        // x += 2;
        // y += x;
        // System.out.println(x + " and " + y);
        // }while (x < 100);
        // 2c
        // for(int y = 20; y > 0; y-=2){
        //     for(int x = 1; x <= y; x++){
        //         System.out.print(x + " " + y);
        //     }
        // }
        //2d
        // int i =1;
        // while(i<=10) {
        //     if (i==10)System.out.println("Program End");
        //     i++;
        // }

        //3
        int prev = 0, current = 1;
        int fibonaciSum = 0;
        for (int i = 1; i <= 10; i++){
            fibonaciSum += prev;
            int next = prev + current;
            prev = current;
            current = next;
        }
        System.out.println("The sum of the first 10 Fibonacci numbers is " + fibonaciSum);
        in.nextLine();

        //4
        String statement = "";
        System.out.print("Enter a statement: ");
        statement = in.nextLine();
        String reverseStatement = "";
        for (int i = 0; i <statement.length(); i++){
            reverseStatement = statement.charAt(i) + reverseStatement;
        }
        System.out.println("The reverse of the statement is: " + reverseStatement);
        in.close();
    }
}
