import java.util.Scanner;

public class conditional_statement_Q3 {
    //Given a number N, print N! (N factorial).
    public static void main(String[] args) {
        int fac=1;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++) {
            fac=fac*i;
        }
        System.out.println(fac);

    }
}
