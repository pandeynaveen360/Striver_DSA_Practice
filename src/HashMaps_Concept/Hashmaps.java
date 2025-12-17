package HashMaps_Concept;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmaps {

    // ================== Node Class ==================
    private class HMNode {
        String key;
        Integer value;

        public HMNode(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return this.key + "@" + this.value;
        }
    }

    // ================== Data Members ==================
    private LinkedList<HMNode>[] bucketArray;
    private int size; // number of key-value pairs

    // ================== Constructors ==================
    public Hashmaps() {
        this(5); // default capacity
    }

    public Hashmaps(int cap) {
        bucketArray = new LinkedList[cap];
        size = 0;

        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    // ================== Hash Function ==================
    private int hashFunction(String key) {
        int hc = key.hashCode();
        return Math.abs(hc) % bucketArray.length;
    }

    // ================== Find in Bucket ==================
    private int findInBucket(LinkedList<HMNode> bucket, String key) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // ================== Put ==================
    public void put(String key, Integer value) {

        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];

        int fi = findInBucket(bucket, key);

        if (fi == -1) {
            bucket.add(new HMNode(key, value));
            size++;
        } else {
            bucket.get(fi).value = value;
        }

        double loadFactor = (double) size / bucketArray.length;
        if (loadFactor > 0.5) {
            rehash();
        }
    }

    // ================== Rehash ==================
    private void rehash() {

        LinkedList<HMNode>[] oldBuckets = bucketArray;

        bucketArray = new LinkedList[oldBuckets.length * 2];
        size = 0;

        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<>();
        }

        for (LinkedList<HMNode> bucket : oldBuckets) {
            for (HMNode node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    // ================== Get ==================
    public Integer get(String key) {
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];

        int fi = findInBucket(bucket, key);
        return (fi == -1) ? null : bucket.get(fi).value;
    }

    // ================== Contains Key ==================
    public boolean containsKey(String key) {
        int bi = hashFunction(key);
        return findInBucket(bucketArray[bi], key) != -1;
    }

    // ================== Remove ==================
    public Integer remove(String key) {
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];

        int fi = findInBucket(bucket, key);
        if (fi == -1) return null;

        HMNode node = bucket.remove(fi);
        size--;
        return node.value;
    }

    // ================== Key Set ==================
    public ArrayList<String> keySet() {
        ArrayList<String> keys = new ArrayList<>();

        for (LinkedList<HMNode> bucket : bucketArray) {
            for (HMNode node : bucket) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    // ================== Display ==================
    public void display() {
        System.out.println("---------------------");
        for (int i = 0; i < bucketArray.length; i++) {
            System.out.print("B" + i + " => ");
            for (HMNode node : bucketArray[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
}
