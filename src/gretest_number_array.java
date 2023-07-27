import java.util.Scanner;

public class gretest_number_array {
    static int gretestNum(int []arr,int x){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        System.out.println("Size "+a+" Enter the element");
        int [] array=new int[a];
        for (int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the number for X");
        int x= sc.nextInt();
        System.out.println("The gretest number in array is: "+gretestNum(array,x));
    }
}
