import java.util.Scanner;

public class prefix_Sum {
    static void printArray(int [] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    static int [] preFix(int [] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Size");
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        int [] prefix=preFix(arr);
        printArray(prefix);
    }
}
