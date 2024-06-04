
/**
 * The HashTable class in Java represents a data structure with buckets, capacity, and size for storing key-value pairs.
 * 
 */

public class HashTable<K, V>{
    private HashNode[] bucket;
    private Integer capacity;
    private int size;

   // The constructor `public HashTable(){ this.capacity = 10; }` is initializing a HashTable object with a default capacity of 10. 
   //This means that if a HashTable object is created without specifying a capacity, it will automatically have a capacity of 10.
    public HashTable(){
        this.capacity = 10;
    }

    // The `public HashTable(Integer capacity)` constructor in the HashTable class is initializing a HashTable object with a specified capacity.
    // When this constructor is called, it sets the capacity of the HashTable to the value provided as an argument. 
    //It then initializes the bucket array with the specified capacity to store HashNode objects. 
    //Additionally, it sets the size of the HashTable to 0, indicating that initially, there are no key-value pairs stored in the HashTable.
    public HashTable(Integer capacity){
        this.capacity = capacity;
        bucket = new HashNode[this.capacity];
        this.size = 0;
    }

    /**
     * The class HashNode represents a node in a hash table with a key-value pair and a reference to the next node.
     */
    private class HashNode<Integer, V>{
        private Integer key;
        private V value;
        private HashNode next;

        // The `public HashNode(Integer key, V value)` constructor in the `HashNode` class is initializing a `HashNode` object with a key-value pair 
        //and a reference to the next node.
        public HashNode(Integer key,  V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    /**
     * The function `getBucketIndex` calculates the index of a key in a bucket array based on the key's value.
     * 
     * @param key The `key` parameter is the value for which you want to calculate the bucket index in a hash table.
     * 
     * @return The method `getBucketIndex` returns the index of the bucket where the key should be stored based on the key's hash code.
     */
    private Integer getBucketIndex(Integer key){
        
        return  key % bucket.length;
    }


   /**
    * The `isEmpty` function in Java checks if a data structure is empty by comparing its size to zero.
    * 
    * @return The method `isEmpty()` is returning a boolean value, which indicates whether the size variable is equal to 0. 
    If the size is 0, it will return true, indicating that the data structure is empty. 
    If the size is not 0, it will return false, indicating that the data structure is not empty.
    */
    public boolean isEmpty(){
        return size==0;
    }

   /**
    * The `size()` function in Java returns the size of a data structure.
    * 
    * @return The `size` of the data structure is being returned.
    */
    public int size(){
        return size;
    }


   /**
    * The `put` method in the `HashTable` class performs input validation and updates the value associated with a key in the hash table if the key already exists, 
    otherwise it adds a new key-value pair to the hash table.
    * 
    * @param key The `key` parameter in the `put` method of the `HashTable` class is the key used to store and retrieve the associated value in the hash table.
     It is used to calculate the hash code and determine the bucket index where the key-value pair will be stored.
    * @param value The `value` parameter in the `put` method of the `HashTable` class represents the value that is associated with the specified key in the hash table.
     When a key-value pair is added or updated in the hash table, the `value` parameter is the value that is stored or updated for
    */
    public void put(Integer key, V value){

        if(key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null!!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode temp = bucket[bucketIndex];
        while(temp != null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        size++;
        temp = bucket[bucketIndex];
        HashNode<Integer, V> node = new HashNode<Integer,V>(key, value);
        node.next = temp;
        bucket[bucketIndex] = node;

    }

   /**
    * This Java function retrieves the value associated with a given key in a hash map.
    * 
    * @param key The `key` parameter in the `get` method is the key of the key-value pair that you want to retrieve the value for from the hash map.
    * 
    * @return The method is returning the value associated with the given key in the hash map. 
    If the key is found in the hash map, the corresponding value is returned. If the key is not found, null is returned.
    */
    public V get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode temp = bucket[bucketIndex];
        while(temp != null){
            if(temp.key.equals(key)){
                return (V) temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    
    /**
     * This function removes a key-value pair from a hash map based on the provided key.
     * 
     * @param key The `key` parameter in the `remove` method is the key of the entry that you want to remove from the hash map.
     * 
     * @return The remove method is returning the value associated with the specified key that was removed from the hash map.
     *  If the key is not found in the hash map, it returns null.
     */
    public V remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode first = bucket[bucketIndex];
        HashNode second = null;


        while(first != null){
            
            if(first.key.equals(key)){

                HashNode temp = first;

                if (second == temp.next){
                    bucket[bucketIndex] = second;
                }else{
                    second.next = temp.next;
                    bucket[bucketIndex] = second;
                }

                first = null;

                size--;
                return (V) temp.value;
            }
            second = first;
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
        hashTable.put(106, "Jeba");
        hashTable.put(23, "Alizha");
        hashTable.put(38, "Neha");

        String value = hashTable.get(101);
        System.out.println(value);
        value = hashTable.get(11);
        System.out.println(value);
        value = hashTable.get(33);
        System.out.println(value);
        value = hashTable.get(39);
        System.out.println(value);
        value = hashTable.get(106);
        System.out.println(value);
        value = hashTable.get(23);
        System.out.println(value);
        value = hashTable.get(38);
        System.out.println(value);
        

        System.out.println(hashTable.size());
        String values = hashTable.remove(101);
        System.out.println(values);
        System.out.println(hashTable.size());
        String s = hashTable.remove(11);
        System.out.println(s);
        System.out.println(hashTable.size());
        String st = hashTable.remove(33);
        System.out.println(st);
        System.out.println(hashTable.size());
        String a = hashTable.remove(39);
        System.out.println(a);
        System.out.println(hashTable.size());
        String b = hashTable.remove(106);
        System.out.println(b);
        System.out.println(hashTable.size());
        String c = hashTable.remove(23);
        System.out.println(c);
        System.out.println(hashTable.size());
        String d = hashTable.remove(38);
        System.out.println(d);
        System.out.println(hashTable.size());
        
        String e = hashTable.remove(101);
        System.out.println(e);
        System.out.println(hashTable.size());

    }
}
