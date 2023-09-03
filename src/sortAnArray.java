import java.util.Scanner;

public class sortAnArray {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverseArray(int[] arr) {
        int temp=0;
       for (int i=0;i< arr.length;i++){
           for (int j=i+1;j< arr.length;j++){
               if (arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" enelments");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Orignal array");
        printArray(arr);
        System.out.println("After sorting");
        reverseArray(arr);
        printArray(arr);
    }
}
