package HashMaps_Concept;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmaps {

    private class HMNode {

        String key;
        Integer value;

        public HMNode(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return this.key + "@" + this.value;
        }
    }


    private LinkedList<Integer>[] bucketArray;

    private int size; // the no. of key value pairs in hashmap

    public void HashMap() {
        this(5);

    }

    public void HashMap(int cap) {
        this.bucketArray = new LinkedList[cap];
        this.size = 0;

        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    public void put(String key, Integer value) {

        // key -> hashfunction -> index
        int bi = hashFunction(key);

        // index -> LinkedLIst
        LinkedList<Integer> bucket = bucketArray[bi];
        // check if the key already exists in the ll or not 
        int fi = findInBucket(bucket, key);
        // if not
        if (fi == -1) {
            HMNode nn = new HMNode(key, value);
            this.size++;
            bucket.addLast(nn);
        } else {
            // if yes, update the value
            Integer n = bucket.get(fi);
            n.value = value;
        }

        // calculate load factor / threshold
        double threshold = (double) this.size / this.bucketArray.length;
        if (threshold > 0.5) {
            rehash();
        }
    }
    
    public int hashFunction(String key){
        
        int hc = key.hashCode();
        int bi = Math.abs(hc) % bucketArray.length;
        return bi;
    }

    private int findInBucket(LinkedList<HMNode> bucket, String k){

        for(int i = 0; i < bucket.size(); i++){
            HMNode node = bucket.get(i);

            if(node.key.equals(k)){
                return i;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<HMNode>[] oldBucketArray = this.bucketArray;

        this.bucketArray = new LinkedList[2 * oldBucketArray.length];

        for(int i = 0; i < bucketArray.length; i++){
            bucketArray[i] = new LinkedList<HMNode>();
        }

        for(int i = 0; i < oldBucketArray.length; i++){
            LinkedList<HMNode> bucket = oldBucketArray[i];

            for(int j = 0; j < bucket.size(); j++){
                HMNode node = bucket.get(i);
                put(node.key, node.value);
            }
        }
    }
    public Integer get(String key){
        int bi = hashFunction(key);

        LinkedList<HMNode> bucket = bucketArray[i];

        int fi = findInBucket(bucket, key);

        if(fi == -1){
            return null;
        }else{
            return bucket.get(fi).value;
        }
    }

    public boolean containsKey(String key){

        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];

        int fi = findInBucket(bucket, key);

        return fi != -1;
    }

    public Integer remove(String key){

        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        int fi = findInBucket(bucket, key);

        if(fi == -1){
            return null;
        }else{
            HMNode node = bucket.remove(fi);
            this.size--;
            return node.value;
        }
    }

    // returns all the keys present in the hashmap in an arraylist
    public ArrayList<String> keySet(){
        ArrayList<String> keys = new ArrayList<>();

        for(int i = 0; i < bucketArray.length; i++){
            LinkedList<Integer> bucket = bucketArray[i];

            for(int j = 0; j < bucket.size(); j++){
                Integer node = bucket.get(j);
                keys.add(node.key);
            }
        }

        return keys;
    }

    public void Display(){

        System.out.println("---------------------");

        for(int i = 0; i < bucketArray.length; i++){

            LinkedList<HMNode> bucket = bucketArray[i];
            System.out.println("B" + i + " => ");

            for(int j = 0; j < bucket.size(); j++){
                HMNode node = bucket.get(j);
                System.out.print(node + ", ");
            }
            System.out.println(".");
        }
        System.out.println("----------------------");
    }
}