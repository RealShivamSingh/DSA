import java.util.Arrays;
import java.util.Scanner;

public class zigZag_array {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    static void swap(int [] arr,int i){
        int temp=arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;

    }
    static void zigZagFashion(int []arr,int n){
        Arrays.sort(arr);
        for (int i=0;i<n-2;i++){
            if (arr[i]>arr[i+1]){
                swap(arr,i);
            }
            else {
                if (arr[i]<arr[i+1]){
                    swap(arr,i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        System.out.println("Enter "+a+" Number elements");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        zigZagFashion(arr,a);
        printArray(arr);
    }
}
