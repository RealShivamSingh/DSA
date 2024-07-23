public class coutRotatedBinary {
    static int countRotatedSortedArray(int []arr,int n){
        n=arr.length;
        int str=0;
        int end=n-1;
        while(str<=end){
            int mid=str+(end-str)/2;

            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if (arr[mid]<arr[next] && arr[mid]<=arr[prev]){
                return mid;
            }
            //Decide to move the in array
            else if (arr[str]<=arr[mid]) {
                str = mid + 1;

            } else if (arr[mid]<=end) {
                end=mid-1;

            }

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={ 15, 18,20, 2, 3, 6, 12};
        int n=arr.length;
        System.out.println("The count is");
        System.out.println(countRotatedSortedArray(arr,n));
    }
}
