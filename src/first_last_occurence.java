public class first_last_occurence {
    static int FirstOccurence(int ele,int a[]){
        int n=a.length;
        int str=0;
        int end=n-1;
        int mid=end+(str-end)/2;
        int res=-1;
        while(str<=end){
            if(ele==a[mid]){
                res=mid;
                end=mid-1;
            } else if (ele<a[mid]) {
                res=mid-1;
            }
            else {
                str=mid+1;
            }
        }
        return res;
    }
    static int lastOccurrence(int ele, int a[]) {
        int n = a.length;
        int str = 0;
        int end = n - 1;
        int res = -1;

        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (a[mid] == ele) {
                res = mid;
                str = mid + 1; // move right to find the last occurrence
            } else if (a[mid] > ele) {
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int [] a={1,2,5,5,5,8,9};
        int ele=5;
        int first = FirstOccurence(ele, a);
        int last = lastOccurrence(ele, a);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
