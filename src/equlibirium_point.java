import java.util.Scanner;

public class equlibirium_point {
    static  int  equlibirumPoint(int [] arr){
        int leftPoint,rightPoint;
        for (int i=0;i<arr.length;i++){
            leftPoint=0;
            for (int j=0;j<i;j++){
                leftPoint+=arr[j];
            }
            rightPoint=0;
            for (int j=i+1;j< arr.length;j++){
                rightPoint+=arr[j];
            }
            if (leftPoint==rightPoint){
                return i+1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        System.out.println("Enter "+a+" Number elements");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(equlibirumPoint(arr));

    }
}
