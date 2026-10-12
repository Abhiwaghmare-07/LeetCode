class LRUCache {
 class Node{
    int key,val;
    Node prev,next;
    Node(int k,int v){
        key=k;
        val=v;
    }
 }
 
   HashMap<Integer ,Node> map=new HashMap<>();
   Node head,tail;
   int capa;
    public LRUCache(int capacity) {
        capa=capacity;
          head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next=tail;
        tail.prev=head;
    }
    public void deleteNode(Node node){
  Node previous=node.prev;
  Node nextone=node.next;
  previous.next=nextone;
  nextone.prev=previous;
 }
 public void insertAfterHead(Node node){
     head.next.prev=node;
     node.next=head.next;
     node.prev=head;
     head.next=node;
 }
    public int get(int key) {
        if(!map.containsKey(key)){
             return -1;
        }else{
            Node node=map.get(key);
              deleteNode(node);
              insertAfterHead(node);
            return node.val;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            deleteNode(node);
            insertAfterHead(node);
        }else{
            if(capa==map.size()){
                Node node=tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            Node node=new Node(key,value);
            map.put(key,node);
            insertAfterHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */