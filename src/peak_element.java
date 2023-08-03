class Solution {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peak_element(int[] arr, int n) {
        //add code here.
        int peak = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                peak = i + 1;
            }
        }
        return peak;
    }
}

