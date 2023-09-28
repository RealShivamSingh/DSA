import java.util.Scanner;

public class removeElement {
    static int remove(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]!=arr[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" number of elements");
        int [] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(remove(arr));
    }
}
