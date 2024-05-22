public class leetcode_268_Amazon {
    public static void main(String[] args) {
        int[] nums = {3,4,0,2,5,1,8,9,6};
        System.out.println(missingNUmber(nums));
    }

    static int missingNUmber(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
