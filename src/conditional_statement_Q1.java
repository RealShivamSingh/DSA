import java.util.Scanner;

public class conditional_statement_Q1 {
    //Check if a given number, N is positive or negative.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
