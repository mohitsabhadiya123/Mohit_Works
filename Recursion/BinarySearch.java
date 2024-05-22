package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,9};
        System.out.println(binarySearch(arr,2,0,arr.length-1));
    }

    static int binarySearch (int[] arr, int target,int left,int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right-left)/2;
        if (arr[mid] == target) {
            System.out.print(target + " is present on index ");
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr,target,left,mid-1);
        }

        return binarySearch(arr,target,mid+1,right);
    }
}
