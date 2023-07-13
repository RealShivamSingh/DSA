/*      AAAA
        BBBB
        CCCC
        DDDD  */
import java.util.Scanner;
public class pattern_Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int cl= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=cl;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
