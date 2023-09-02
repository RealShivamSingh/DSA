import java.util.Scanner;


public class missing_number {
    static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
    static int miss(int [] arr,int n){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (n==arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,5};
        printArray(arr);
        System.out.println("Give value for n");
        int n= sc.nextInt();

    }
}
