public class leetcode_1095 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,3,1},3));
    }

    static int search (int[] arr,int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostics(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnostics(arr,target,peak+1,arr.length-1);
    }

    private static int orderAgnostics(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end-start)/2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
