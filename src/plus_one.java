import java.util.Scanner;

public class plus_one {
    static void plusOne(int [] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            if (arr[i]==n){
                i=n+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ssss");
        int n=sc.nextInt();
        System.out.println("ENter "+n+" Number of elements");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
       plusOne(arr);
    }
}
