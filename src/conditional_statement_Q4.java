import java.util.Scanner;

public class conditional_statement_Q4 {
    //Given a number N, print even numbers upto N.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("It is Even number");
        }
        else {
            System.out.println("It is Odd Number");
        }
    }
}
