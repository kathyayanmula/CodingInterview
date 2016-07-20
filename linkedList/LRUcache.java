package linkedList;

import java.util.HashMap;

public class LRUcache {
    
    DNode head;
    DNode tail;
    int capacity;
    HashMap<Object, DNode> map;
    
    public LRUcache(int capacity){
        this.capacity = capacity;
        this.head = null;
        tail = head;
        this.map = new HashMap<Object, DNode>();
    }
    
    public int get(Object key){
        if(!map.containsKey(key))
            return -1;
        DNode current = map.get(key);
        moveToHead(current);
        return current.val;
    }
    
    public void set(Object key, int value){
        if(get(key) != -1){
            map.get(key).val = value;
            return;
        }
            
        if(map.size() == capacity){
            map.remove(key);
            DNode temp = tail.prev;
            temp.next = null;
            tail.prev = null;
            tail = temp;
        }
        DNode current = new DNode(key, value);
        map.put(key, current);
        moveToHead(current);
        }
    
    public void moveToHead(DNode node){
        if(node == head)
            return;
        if(node.prev != null)
            node.prev.next = node.next;
        if(node.next != null)
            node.next.prev = node.prev;
        node.prev = null;
        node.next = head;
        head = node;
    }
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}

class DNode{
    Object key;
    int val;
    DNode prev;
    DNode next;
    public DNode(Object key, int val){
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}
