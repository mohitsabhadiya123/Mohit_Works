package HM_HS;

import java.util.*;
public class Pro_6 {
    public static void main(String[] args){
        int[] arr1={1,2,2,3,4,5,5};
        int[] arr2={1,2,3,3,4,5,5};
        if(arr1.length!=arr2.length){
            System.out.println("not equal");
            return;
        }
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        for(int i=0;i<arr1.length;++i){
            if(hm1.containsKey(arr1[i])){
                hm1.put(arr1[i],hm1.get(arr1[i])+1);
            }else{
                hm1.put(arr1[i],1);
            }
            if(hm2.containsKey(arr2[i])){
                hm2.put(arr2[i],hm2.get(arr2[i])+1);
            }else{
                hm2.put(arr2[i],1);
            }
        }
        if(hm1.size()!=hm2.size()){
            System.out.println("false");
            return;
        }
        for(Map.Entry<Integer,Integer> e:hm1.entrySet()){
            if((!(hm2.containsKey(e.getKey()))) || (hm1.get(e.getKey())!=hm2.get(e.getKey()))){
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
    }
}
