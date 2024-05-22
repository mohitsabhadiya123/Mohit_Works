public class leetcode_744 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,12,13,34};
        int target = 14;
        System.out.println(ceiling(arr,target));
        System.out.println(flooring(arr,target));

        char[] chars = {'c','f','j'};
        char target2 = 'a';
        System.out.println(nextGreatestLetter(chars,target2));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }

    static int ceiling(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return start;
    }

    static int flooring(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return end;
    }
}
