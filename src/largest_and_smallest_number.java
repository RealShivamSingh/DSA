import java.util.Arrays;
import java.util.Scanner;

public class largest_and_smallest_number {
    static int [] smallestAndLargestElement(int [] arr){
        Arrays.sort(arr);
        int [] ans={arr[0],arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("The size of array is "+n+" Same enter the element");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans=smallestAndLargestElement(arr);
        System.out.println("Smallest number is array "+arr[0]);
        System.out.println("Largets number in array "+arr[arr.length-1]);
    }
}
