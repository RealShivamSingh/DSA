public class reverseing_array {
    static void reverseArray(int [] arr,int start,int end){
        int temp;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    static void printArray(int [] arr,int size){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={3,4,8,1,6};
        printArray(arr,5);
        reverseArray(arr,0,4);
        System.out.println("Reversed array");
        printArray(arr,5);

    }

}
