import java.util.Scanner;

public class gfgQuestion_pratice {
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void moveNegetiveNumber(int [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[j]<0 || arr[j]>arr[i+1]){
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int [] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        moveNegetiveNumber(arr);
    }
}
