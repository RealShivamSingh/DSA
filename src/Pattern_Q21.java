import java.util.Scanner;

public class Pattern_Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int col= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=col-i+1;j++){
                System.out.print((char)(64+j));

            }
            System.out.println();
        }
    }
}
