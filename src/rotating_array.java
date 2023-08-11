import java.util.Scanner;

public class rotating_array {
    static int[] rotatingArrayOnK(int [] arr,int k){
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a= sc.nextInt();
        int [] arr=new int[a];
        System.out.println("Enter "+a+"Elements");
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k= sc.nextInt();
        System.out.println("Origanal array is:-");
        printArray(arr);
        int [] ans= rotatingArrayOnK(arr,k);
        System.out.println("Array after rotation");
        printArray(ans);


    }
}
