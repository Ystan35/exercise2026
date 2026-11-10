package W06.mine;
import java.util.Random;
import java.util.Arrays;

public class W06L02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] result = new int[10];
        int count = 0;
        
        while (count < 10) {
            int num = rand.nextInt(21); 
            
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (result[i] == num) {
                    exists = true;
                    break; 
                }
            }
            
            if (!exists) {
                result[count] = num;
                count++;
            }
        }
        
        System.out.println("10 unique random integers:");
        System.out.println(Arrays.toString(result));
    }
}