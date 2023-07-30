import java.util.Scanner;

public class array_manupulation_patten {
    static int manupulatioPattern(int [] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a= sc.nextInt();
        System.out.println("Now enter the element");
        int [] arr=new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The non repeated array is :"+manupulatioPattern(arr));
    }

}
