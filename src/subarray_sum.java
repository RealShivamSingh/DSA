import java.util.Scanner;

public class subarray_sum {
    static void subArraySum(int [] arr,int n,int sum) {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
            if (currentSum==sum){
                System.out.println("Sum found at index"+i);
                return;
            }
            for (int j=i+1;j<n;j++){
                currentSum+=arr[j];
                if (currentSum==sum){
                    System.out.println("Sum found at index"+i+"and"+j);
                    return;
                }
            }
        }
    }
    static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        System.out.println("Give the total sum");
        int sum= sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        subArraySum(arr,n,sum);
        printArray(arr);

    }
}
