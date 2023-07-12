/*      *****
        *   *
        *   *
        *   *
        *****     */
import java.util.Scanner;
public class Pattern_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int cl= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=cl;j++){
                if (i==1|| i==r || j==1 || j==cl) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            }
        }
    }

