package W05.mine;
import java.util.Random;
public class W05L06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100000000);
        System.out.println(num);
        System.out.println("The number of digits in the number is " + String.valueOf(num).length());
    }
}
