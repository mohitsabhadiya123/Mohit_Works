public class leetcode_33 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(search(nums,target));
    }
    static int search (int[] nums, int target) {
        if(nums.length <=1) {
            if (nums[0] == target){
                return 0;
            }
            return -1;
        }
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums,target,0,nums.length-1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else {
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    static int binarySearch(int[] nums,int target,int start, int end) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end-start)/2;

            // 4 case
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
