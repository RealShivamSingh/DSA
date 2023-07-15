/*      AAAA
        BBB
        CC
        D */
import java.util.Scanner;
public class Pattern_Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=i;j<=r-1;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
