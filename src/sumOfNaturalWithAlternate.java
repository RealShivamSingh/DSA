import java.util.Scanner;

public class sumOfNaturalWithAlternate {
    static int alternateSum(int n){
        if (n==0){
            return 0;
        }
        if (n%2==0){
            return alternateSum(n-1)-n;
        }
        else {
            return alternateSum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alternateSum(n));
    }
}
