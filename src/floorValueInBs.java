public class floorValueInBs {
    static int floorInBs(int []arr,int n,int x){
        n=arr.length;
        int strt=0,end=n-1;
        //if start and high cross each other
        if(strt>end)
            return -1;
        //if last element is smaller than x
        if(x>=arr[end])
            return end;
        //finding mid element
        int mid=strt+(end-strt)/2;
        //if middle point is floor
        if (arr[mid]==x)
            return mid;
        //if x lies between mid-1 and mid
        if (mid>0 && arr[mid-1] <=x && x< arr[mid])
            return mid-1;

        if (x<arr[mid])
            return floorInBs(arr,mid-1,x);
        return floorInBs(arr,mid+1,x);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,9,10};
        int x=7;
        int n=arr.length;

    }
}
