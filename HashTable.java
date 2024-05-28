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
    public void put(K key, V value){

    }

    //get result
    public V get(K key){

        return null;
    }

    //remove
    public V remove(K key){
        return null;
    }

    public static void main(String[] args) {
       
    }
}
