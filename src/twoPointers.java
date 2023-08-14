import java.util.Scanner;

public class twoPointers {
    static  void printArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int [] arr,int i,int j){
        int n=arr.length;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortZeroesAndOnes(int [] arr){
        int n=arr.length;
        int zeroes=0;
        //Cout numbers of zeros.
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        //0 to zeroes-1:0 ; Zeores to n-1:1
        for (int i=0;i<n;i++){
            if (i<zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" Element");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Origanal array");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array:-");
        printArray(arr);
    }
}
