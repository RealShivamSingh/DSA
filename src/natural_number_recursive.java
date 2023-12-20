import java.util.Scanner;

public class natural_number_recursive {
    static void printDrecrese(int n){
        //Base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //Self work
        System.out.println(n);
        //recursive work
        printDrecrese(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDrecrese(n);
    }
}
