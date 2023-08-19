import java.util.Scanner;

public class non_decreasing_order {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (arr[left] < arr[right]) {
                ans[k++] = arr[left] * arr[right];
                left--;
            } else {
                ans[k++] = arr[right] * arr[right];
                right++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" Element");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before of sorting");
        printArray(arr);
        sortSquare(arr);
        System.out.println("After sorting");
        printArray(arr);

    }
}

