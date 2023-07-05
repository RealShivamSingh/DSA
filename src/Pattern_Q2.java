/*        // N = 5
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5*/
import java.util.Scanner;
public class Pattern_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nm=1;
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nm + " ");
            }
            System.out.println();
            nm++;
        }
    }
}
