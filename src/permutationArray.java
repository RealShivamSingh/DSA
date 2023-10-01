public class permutationArray {
    static void printArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    static void swap(int []nums,int i,int j){
        int temp;
       temp=nums[i];
       nums[i]=nums[j];
       nums[j]=temp;

    }
    static void permutatio(int[] nums){
        for (int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                swap(nums, i, j);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums={1,2,3};
        permutatio(nums);
        printArray(nums);
    }
}
