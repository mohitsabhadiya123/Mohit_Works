package HM_HS;

import java.util.*;
public class Pro_7 {
    public static void  main(String[] args){
        int[] arr1={1,2,2,3,4,5,5,5,4,4};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr1){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(arr1[i])+1);
            }else{
                hm.put(i,1);
            }
            if(hm.get(i)==2){
                System.out.print(i+" ");
            }
        }
//        for(Map.Entry e:hm.entrySet()){
//            if(Integer.parseInt(e.getValue().toString())>1){
//                System.out.print(e.getKey()+" ");
//            }
//        }
    }
}
