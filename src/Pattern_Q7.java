/*      *****
        ****
        ***
        **
        *  */
import java.util.Scanner;
public class Pattern_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=r;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
