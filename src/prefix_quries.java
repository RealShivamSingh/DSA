import java.util.Scanner;

public class prefix_quries {
    static int [] oneIndexPrefixQuries(int [] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        System.out.println("Enter "+n+ " Element");
        for (int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }
       int [] prefSum=oneIndexPrefixQuries(arr);
        System.out.println("Enter number of Qurery");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l= sc.nextInt();
            int r=sc.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("Sum "+ans);
        }


    }
}
