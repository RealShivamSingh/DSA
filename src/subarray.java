import java.sql.SQLOutput;
import java.util.Scanner;

public class subarray {
/*    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }*/

    static void subArray(int [] arr,int ans){
        for (int i=0;i< arr.length;i++) {
            int sum=0;
            for (int j = i; j < arr.length;j++) {
                sum = arr[j] + sum;
                if (sum == ans) {
                    System.out.println( (i+1)+ " " +(j+1));
                    break;

                }
            }
            if (sum==ans){
                break;
            }
        }
    }

    public static void main(String[] args) {

       /* int [] arr={1,2,3,7,5};
        int ans=12;
        subArray(arr,ans);*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        System.out.println("Enter "+a+" Number elements");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter ans should be");
        int ans= sc.nextInt();
        subArray(arr,ans);


    }
}
