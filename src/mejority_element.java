import java.util.Scanner;

public class mejority_element {
    static void  majorityElement(int [] arr)
    {
        int cout=0;
        int n=arr.length;
        for (int i=0;i<=n;i++){
            for (int j=i;j<=n;j++){
                if (arr[i]==arr[j]){
                    cout++;
                    System.out.println(cout);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Size of array");
        int [] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        majorityElement(arr);
    }
}
