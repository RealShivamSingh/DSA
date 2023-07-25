
public class refrence_array {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            System.out.println(" ");
        }

    }
    static void change_array(int []arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int [] arr=new int[3];
        arr[0]=5;
        arr[1]=8;
        arr[2]=9;
        change_array(arr);
        printArray(arr);
    }
}
