import java.util.Scanner;

public class reversing_array {
    static void swapInArray(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int [] arr,int n){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size the of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the element in array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        reverseArray(arr,n);

    }
}
