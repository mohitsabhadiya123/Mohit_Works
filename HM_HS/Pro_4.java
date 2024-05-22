package HM_HS;

import java.util.HashSet;
public class Pro_4 {
    public static void main(String[] args){
        int[] arr={16,2,3,1,7,9,2};
        HashSet<Integer>hs=new HashSet<>();
        int sum=16;
        for(int i:arr){
            if(hs.contains(sum-i)){
                System.out.println("Sum is Present");
                return;
            }else{
                hs.add(i);
            }
        }
        System.out.println("Sum is not present");
    }
}
