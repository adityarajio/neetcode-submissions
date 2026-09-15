class Node{
    int key, value;
    Node next;
    public Node(int key, int value, Node next){
        this.next = next;
        this.key = key;
        this.value = value;
    }
    public Node(){
        this(-1, -1, null);
    }
}

class MyHashMap {
    private static final int size = 769;
    private Node[] map;

    public MyHashMap() {
        map = new Node[size];
        for(int i = 0; i < size; i++){
            map[i] = new Node();
        }
    }
    
    private int getHash(int key){
        return key% map.length;
    }
    public void put(int key, int value) {
        Node curr = map[getHash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key, value, null);
    }
    
    public int get(int key) {
        Node curr = map[getHash(key)].next;
        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node curr = map[getHash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */