import java.util.Scanner;

public class triplet_taget_sum {
    static int  targetSum(int [] arr,int target){
        int n= arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a= sc.nextInt();
        System.out.println("Now enter the element");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the the target value");
        int target= sc.nextInt();
        System.out.println("The total time sum is "+targetSum(arr,target));
    }

}
