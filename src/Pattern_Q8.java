/*      1
        22
        333
        4444
        55555 */
import java.util.Scanner;
public class Pattern_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
