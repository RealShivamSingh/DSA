public class binarySearch {
    static  int binarySearch(int []a,int target){
        int n=a.length;
        int str=0;
        int end=n-1;
        while(str<=end){
            int mid=end+(str-end)/2;
            if (target==a[mid]){
                System.out.println("The targeted value index is:");
                return mid;
            } else if (target<a[mid]) {
                end=mid-1;

            }else {
                str=mid+1;
            }
        }
        return -1;

    }
    /*public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        int target=0;
        while(target!=10) {
            System.out.println(binarySearch(a, target));
            target++;
        }*/
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        int target=1;
        System.out.println(binarySearch(a, target));
    }
}
