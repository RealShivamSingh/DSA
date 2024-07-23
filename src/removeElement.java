import java.util.Scanner;

public class removeElement {
    static int removeElement(int [] arr,int value){
        int cout=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (value!=arr[j]){
                    cout++;
                }
            }
        }
        return cout;
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
        System.out.println("Enter remove value");
        int value=sc.nextInt();
        System.out.println(removeElement(arr,value));
    }
}
