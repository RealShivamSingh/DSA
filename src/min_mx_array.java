public class min_mx_array {
    static void findMx(int [] arr){
        int mx=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println("Maximum number in array is:- "+mx);
    }
    static void findMin(int [] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minmum number in array is:-  "+min);
    }

    public static void main(String[] args) {
        int[] arr={4,5,12,6,9};
        findMx(arr);
        findMin(arr);

    }

}
