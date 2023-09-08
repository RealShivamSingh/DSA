import java.util.Scanner;


public class wave_array {
    static void swapArray(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void waveArray(int [] arr,int n){
        for(int i = 0; i < n-1; i+=2) {
            //swap odd and even positions
            if (i > 0 && arr[i - 1] > arr[i]) {
                swapArray(arr, i, i - 1);
                if (i < n - 1 && arr[i + 1] > arr[i]) {
                    swapArray(arr, i, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        System.out.println("Enter "+a+" Number elements");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        waveArray(arr,a);
    }
}
