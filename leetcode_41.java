public class leetcode_41 {
    public static void main(String[] args) {
        int[] nums = {3,4,0,2,5,1,8,5,6,9,6};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length-1;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
