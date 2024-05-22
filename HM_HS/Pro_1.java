package HM_HS;

import java.util.HashSet;
public class Pro_1 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 34, 13, 24, 56, 45, 34, 32, 35, 45, 23};
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs);
    }
}
