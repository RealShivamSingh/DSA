import java.util.Scanner;

public class conditional_statement_Q5 {
    //Given a number N, check if it is prime or not. Print YES or NO.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        boolean flag=false;
        while(i<=n/2){
            if(n%i==0){
                flag=true;
                break;
            }
            ++i;
          if(!flag){
              System.out.println("Yes");
          }
          else {
              System.out.println("No");
          }
        }
    }
}
