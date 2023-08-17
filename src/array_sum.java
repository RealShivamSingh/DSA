import java.util.Scanner;

public class array_sum {
    static int  sumOfAllElement(int [] arr){
        int sum=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter"+n+"Elemnts");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfAllElement(arr));

    }
}
