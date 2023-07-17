/*      A
        BB
        CCC
        DDDD
        EEEEE   */
import java.util.Scanner;
public class pattern_Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
