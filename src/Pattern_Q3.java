    /*  54321
        54321
        54321
        54321
        54321 */
import java.util.Scanner;

public class Pattern_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int cl= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=cl;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
