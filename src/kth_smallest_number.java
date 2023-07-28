import java.util.Arrays;
import java.util.Scanner;

public class kth_smallest_number {
    static int largestAndSmallest(int []arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int k=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of element");
        int n= sc.nextInt();
        System.out.println("Size of element is "+n+"Now enter the same element ");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Smallest Element is"+largestAndSmallest(arr,k));
    }
}
