import java.util.Scanner;

public class count_pairs {
    static void countPairs(int [] arr,int k){
        for (int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=i;i<arr.length;j++){
                if (i+j==k){
                    sum++;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Number of elements");
        int [] arr=new int[n];
        for (int i=0;i< args.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Here is answer");
        countPairs(arr,k);
    }
}
