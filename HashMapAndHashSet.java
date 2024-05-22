import java.util.HashSet;

public class HashMapAndHashSet {
    public static void main(String[] args) {
        System.out.println(distinctNumber(new int[]{2,3,4,5,2,6,7,1,7,8}));
        System.out.println(uniqueNumber(new int[]{2,3,4,5,2,6,7,1,7,8}));
    }

    static HashSet<Integer> distinctNumber (int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    static HashSet<Integer> uniqueNumber (int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)){
                set.remove(num);
            }
            else {
                set.add(num);
            }
        }
        return set;
    }
}
