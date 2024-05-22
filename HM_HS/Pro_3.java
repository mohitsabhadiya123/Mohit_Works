package HM_HS;

import java.util.*;
public class Pro_3 {
    public static void main(String[] args){
        int[] arr={1,2,1,3,2,4,2,5,4,6};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        System.out.println(hm);
        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer,Integer> e : hm.entrySet()) {
            if (maxValue < e.getValue()) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println(maxKey + "=" + maxValue);
    }
}
