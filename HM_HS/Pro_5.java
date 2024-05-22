package HM_HS;

import java.util.HashMap;
public class Pro_5 {
    public static void main(String[] args){
        int[] arr={1,1,1,1,2,3,1};
        HashMap<Integer,Integer>hs=new HashMap<>();
        int max=1;
        int maxElement=arr[0];
        for(int i:arr){
            if(hs.containsKey(i)){
                if(max<hs.get(i)+1){
                    max=hs.get(i)+1;
                    maxElement=i;
                }
                hs.put(i,hs.get(i)+1);
            }else{
                hs.put(i,1);
            }
        }
        System.out.println(maxElement+":"+max);
    }
}
