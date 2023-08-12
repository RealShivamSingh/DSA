import java.util.Scanner;

public class finding_peak_element {
    static int peakElement(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }

        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" Element");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        peakElement(arr);
    }
}
