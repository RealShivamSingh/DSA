import java.util.Scanner;

public class taking_input_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n= sc.nextInt();
        int [] num=new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }


    }

