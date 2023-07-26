import java.util.Scanner;

public class last_acurence_number {
    static int numberAcurence(int []arr,int x){
        int lastIndex=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a= sc.nextInt();
        System.out.println("Size of Array is: "+a+"Enter element");
        int [] arr=new int[a];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the last element");
        int x= sc.nextInt();
        System.out.println("The last occurence number is: "+numberAcurence(arr,x));
    }
}
