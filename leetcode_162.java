public class leetcode_162 {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1}));
    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start<end) {
            int mid = start + (end-start)/2;

            if (nums[mid] > nums[mid+1]) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
