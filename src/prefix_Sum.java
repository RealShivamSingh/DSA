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
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=0;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Size");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        int [] pre=preFix(arr);
        printArray(pre);
    }
}
