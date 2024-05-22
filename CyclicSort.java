public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,4,0,2,5,1,8,9,6};
        sort(nums);
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
