public class HashTable<K, V>{
    private HashNode[] bucket;
    private Integer capacity;
    private int size;

    public HashTable(){
        this.capacity = 10;
    }

    public HashTable(Integer capacity){
        this.capacity = capacity;
        bucket = new HashNode[capacity];
        this.size = 0;
    }

    private class HashNode<Integer, V>{
        private Integer key;
        private V value;
        private HashNode next;

        public HashNode(Integer key,  V value){
            this.key = key;
            this.value = value;
        }
    }

    private Integer getBucketIndex(Integer key){
        
        return  key % bucket.length;
    }


    //is empty
    public boolean isEmpty(){
        return size==0;
    }

    //get the size;
    public int size(){
        return size;
    }

    //put value key, value
    public void put(Integer key, V value){

        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];
        
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = bucket[bucketIndex];
        HashNode node = new HashNode<Integer,V>(key, value);
        node.next = head;
        bucket[bucketIndex] = node;
    }

    //get result
    public V get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }

    //remove
    public V remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode first = bucket[bucketIndex];
        HashNode beforeFirst;
        
        while(first != null){
            beforeFirst = first;
            if(first.key.equals(key)){
                beforeFirst.next = first.next;

                HashNode temp = first;
                temp.value = first.value;
                first.next = null;
                first = null;
                size--;
                return (V) temp.value;
            }
            
            first = first.next;
        }
        return null;
    }

    public static void main(String[] args) {
       
        HashTable<Integer, String> hashTable = new HashTable<>(10);
        hashTable.put(101, "Alamin");
        hashTable.put(11, "Rakib");
        hashTable.put(33, "Nuha");
        hashTable.put(39, "Waziha");
        hashTable.put(101, "Tasnim");

        String value = hashTable.get(101);
        System.out.println(value);
        value = hashTable.get(11);
        System.out.println(value);
        value = hashTable.get(33);
        System.out.println(value);
        value = hashTable.get(39);
        System.out.println(value);
        

        System.out.println(hashTable.size());
    }
}
