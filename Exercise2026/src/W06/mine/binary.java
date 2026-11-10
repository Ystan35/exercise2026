package W06.mine;
import java.util.Random;

public class binary {
    public static void main(String[] args) {
        Random rand = new Random();
        int integer = rand.nextInt(256);
        
        System.out.println("Random Number: " + integer);
        
        int[] binaryArray = new int[8];
        
        for (int i = 7; i >= 0; i--) {
            int arrayIndex = 7 - i; 
            
            if (integer >= Math.pow(2, i)) {
                integer -= Math.pow(2, i);
                binaryArray[arrayIndex] = 1;
            } else {
                binaryArray[arrayIndex] = 0;
            }  
        }
        
        System.out.print("Binary representation: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
        System.out.println();
    }
}
