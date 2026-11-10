package W06.mine;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class W06L05 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i< 20; i++){
            array[i] = rand.nextInt(101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int j = 0; j <array.length/2; j++){
            int temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }
        System.out.println("Array in decending order");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter a number to search: ");
        int find = in.nextInt();
        in.close();
    }
}
