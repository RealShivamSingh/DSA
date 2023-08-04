import java.util.Scanner;

public class repeatNumber {
    static int repeatingInteger(int [] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        System.out.println("Enter the "+a+ " element");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The repeated element is :"+repeatingInteger(arr));
    }
}
