public class laddersInArray {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    static void ladderInArr(int [] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    break;
                }
                if (j == arr.length) // the loop didn't break
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={16,17,4,3,5,2};
        printArray(arr);


    }
}
