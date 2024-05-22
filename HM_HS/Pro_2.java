package HM_HS;

import java.util.HashSet;
public class Pro_2 {
    public static void main(String[] args){
        int[] arr1={20,45,4,34,56,67,453,34};
        int[] arr2={2};
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr1){
            hs.add(i);
        }
        for(int i:arr2){
            if(!hs.contains(i)){
                System.out.println("not a subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
