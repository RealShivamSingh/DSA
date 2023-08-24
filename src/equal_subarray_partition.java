import java.util.Scanner;

public class equal_subarray_partition {
    static int  findArraySum(int []arr){
        int totalsum=0;
        for (int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int [] arr){
        int prefSum=0;
        int totalSum=findArraySum(arr);
        for (int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if (suffixSum==prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Element");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Equal partition is: "+equalSumPartition(arr));
    }


    }


