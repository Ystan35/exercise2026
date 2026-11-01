package W05.mine;
import java.util.Random;
public class W05L05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int p1, p2;
        p1 = 0;
        p2 = 0;
        boolean turn = true;
        while (p1 <= 100 && p2 <= 100) {
            int roll = rand.nextInt(6) + 1;
            if (roll == 6){
                roll = roll + rand.nextInt(6) + 1;
            }
            if (turn) {
                p1 += roll;
                turn = false;
            } else {
                p2 += roll;
                turn = true;
            }
        }
        System.out.println("Player 1: " + p1 + " Player 2: " + p2);
        if (p1 > 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
