import java.util.Scanner;

public class second_largest {
    static int findMx(int []arr){
        int mx=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMx(int []arr) {
        int mx = findMx(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMx=findMx(arr);
        return secMx;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size the of array");
        int n= sc.nextInt();
        System.out.println("The size of array is "+n+"Now enter the same element");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(findSecondMx(arr));

    }
    }


