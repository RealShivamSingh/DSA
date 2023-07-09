import java.util.Scanner;

public class Pattern_Q10 {
    public static void main(String[] args) {
        int count =1;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; ++j) {
                    System.out.print(count+ " ");
                    count++;
                }
                System.out.println();
            }
        }
    }

