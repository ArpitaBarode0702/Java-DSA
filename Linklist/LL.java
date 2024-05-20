package Linklist;

public class LL {
    Node head;
    Node tail;
     int size;
    LL(){
     this.size=0;
    }
    //adding element at first if the list is empty or full
    public void interFIrstelem(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void addatlast(int val){
        if(tail==null){
            interFIrstelem(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        node=tail;
        size+=1;

    }
    //adding element at particular index
    public void addatindex(int val,int index){
        if(index==0){
            interFIrstelem(val);
        }
        if  (index==size){
            addatlast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);//hhere we created new node with value and neaxt equal to temp's next so we have nwe node lik with the nodes of temp.next
        temp.next=node;
        size++;
    }
    //deleting first element and return the deleted value
    public int  deletefirst(){
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<1){
            return deletefirst();
        }
        Node seconlast=getindex(size-2);
        int value=tail.val;
        tail=seconlast;
        tail.next=null;
        return value;
       
    }
    public Node getindex(int n){
        Node node=head;
        for(int i=0;i<n;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    }
  
  private class Node {
      private  int val;
      private  Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    
        
    }
    
}
