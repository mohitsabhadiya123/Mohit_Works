package HM_HS;

import java.util.ArrayList;
import java.util.LinkedList;
public class Implementation {
        static class HashMap<K,V>{//generic data type is use(parameterized type)
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;//n=Total number of nodes
        private  int N;//N=Size of Array of LinkedList
        private LinkedList<Node>[] buckets;
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[N];
            for(int i=0;i<N;++i){
                this.buckets[i]=new LinkedList<>();
            }
        }
        public int hashCode(K key){
            return Math.abs(key.hashCode())%N;
        }
        public void put(K key,V value){
            int bucketNumber=hashCode(key);//hashCode(key) it return bucket number between 0 to N-1
            int search= search(bucketNumber,key);//if it's return -1 then key is not present otherwise key is present
            if(search==-1){
                buckets[bucketNumber].add(new Node(key,value));
                n++;//increment n by 1
            }else{
               buckets[bucketNumber].get(search).value=value;
            }
        }

        private int search(int bucketNumber, K key) {
            LinkedList<Node>list=buckets[bucketNumber];
            for(int i=0;i<list.size();++i){
                if(list.get(i).key.equals(key)){
                    return i;
                }
            }
            return -1;
        }
        private V get(K key){
            int bucketNumber=hashCode(key);
            int search=search(bucketNumber,key);
            if(search==-1){
                return null;
            }
            return buckets[bucketNumber].get(search).value;
        }
        private boolean containsKey(K key){
            int bucketNumber=hashCode(key);
            int search=search(bucketNumber,key);
            if(search==-1){
                return false;
            }
            return true;
        }
        public int size(){
            return n;
        }
        public void remove(K key){
            int bucketNumber=hashCode(key);
            int search=search(bucketNumber,key);
            if(search!=-1){
                buckets[bucketNumber].remove(search);
                n--;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K>list=new ArrayList<K>();
            for(int i=0;i<buckets.length;++i){
                LinkedList<Node>ll=buckets[i];
                for(int j=0;j<ll.size();++j){
                    list.add(ll.get(j).key);
                }
            }
            return list;
        }
    }
    public void main(String[] args){
//           HashMap<Integer,String>map=new HashMap<>();
//           map.put(45,"Rohit");
//           map.put(18,"Virat");
////           map.remove(45);
////           System.out.println(map.get(45));
////        System.out.println(map.containsKey(5));
////        System.out.println(map.size());
////        System.out.println(map.isEmpty());
////        System.out.println(map.keySet());
//        for(int key:map.keySet()){
//            System.out.println(key+" "+map.get(key));
//        }
        HashMap<String,String>map= new HashMap<>();
        map.put("abc","wdbj");
        map.put("abc","mcdje");
        System.out.println(map.keySet());
    }
}
