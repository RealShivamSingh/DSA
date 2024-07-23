import java.util.Scanner;

public class stock_gfg {
    static void sellBuyStock(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter buy day arr[i]");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ssss");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Number of elements");
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

    }
}
