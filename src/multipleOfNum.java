import java.util.Scanner;

public class multipleOfNum {
    static void totalMul(int n,int k){
        if (k==1){
            System.out.println(n);
            return;
        }
        totalMul(n,k-1);
        System.out.println(n*k);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        totalMul(n,k);
    }
}
