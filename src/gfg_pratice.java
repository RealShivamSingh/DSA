import java.util.Scanner;

public class gfg_pratice {
    static int countNumber(int [] arr,int n){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int a=sc.nextInt();
        System.out.println("Enter "+a+" Elements");
        int [] arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Give a maching number to cout");
        int n=sc.nextInt();
        System.out.println(countNumber(arr,n));
    }
}
