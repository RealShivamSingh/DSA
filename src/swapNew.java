import java.util.Scanner;

public class swapNew {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap A"+a);
        System.out.println("After swap B"+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n=sc.nextInt();
        System.out.println("Enter the second number");
        int m=sc.nextInt();
        swap(n,m);


    }
}
