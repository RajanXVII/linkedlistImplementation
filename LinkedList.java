class LinkedList{
    Node node;
    
public void insert(LinkedList list,int data){
    Node tmp=new Node(data);
    
    if(list.node==null){
        list.node=tmp;
        System.out.println("Linkedlist node empty check");
        
    }
    else{
        System.out.println("Adding"+data);
        while(list.node.next!=null){
            list.node=list.node.next;
        }
        list.node.next=tmp;
    }
}

public void printList(LinkedList list){
    while(list.node.next!=null){
        System.out.println(list.node.data);
        list.node=list.node.next;
    }
}
    
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

class HellowWorld{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(list,10);
        list.insert(list,20);
        list.insert(list,30);
        list.printList(list);
        
    }
}
