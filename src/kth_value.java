import java.util.Arrays;
import java.util.Scanner;

public class kth_value {
    static int  kthMinMax(int [] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" Number of element");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();;
        }
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("The kth elemnt is :"+kthMinMax(arr,k));
    }
}
