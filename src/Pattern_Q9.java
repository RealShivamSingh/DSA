/*      1
        12
        123
        1234
        12345 */
import java.util.Scanner;
public class Pattern_Q9 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int r= sc.nextInt();
            for (int i=1;i<=r;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

