package W05.mine;
import java.util.Scanner;
public class W05L01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt();
        System.out.print("The factors are: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                if (i != n){
                    System.out.print(i + ", ");
                }else{
                    System.out.print(i);
                }
                
            }
        }
        in.close();
    }
}
