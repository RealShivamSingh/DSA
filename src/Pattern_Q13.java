/*      123456
        123456
        123456
        123456
        123456    */
import java.util.Scanner;
public class Pattern_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=6;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}