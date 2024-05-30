public class HashTable<K, V>{
    private HashNode[] bucket;
    private Integer capacity;
    private int size;

    public HashTable(){
        this.capacity = 10;
    }

    public HashTable(Integer capacity){
        this.capacity = capacity;
        bucket = new HashNode[this.capacity];
        this.size = 0;
    }

    private class HashNode<Integer, V>{
        private Integer key;
        private V value;
        private HashNode next;

        public HashNode(Integer key,  V value){
            this.key = key;
            this.value = value;
            this.next = null;
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

    //get result
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

    //remove
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
