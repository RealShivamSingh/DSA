import java.util.Scanner;

public class suffixSum {
    static int[] printSuffixSum(int[] arr){
        for (int i=arr.length-2;i>=0;i--){
            arr[i+1]+=arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int [] sufSum=printSuffixSum(arr);
        System.out.println("Sufix array is :- "+sufSum);
    }
}
