import java.util.ArrayList;
import java.util.List;

class leetcode_448_Google {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}