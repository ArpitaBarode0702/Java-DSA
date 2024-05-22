package DoublyLinkList;

import Patterns.third;

public class DLL {
   Node head;
   int size;
   DLL(){
    size=0;
   }
   
   public void addatfirst(int val){
    Node node=new Node(val);
    node.next=head;
    node.prev=null;
    if(head!=null){
        head.prev=node;
    }
      head=node;
      size++;

   }
   //adding element at last 
   public void addatlast(int val){
    Node node =new Node(val);
    if(head==null){
        addatfirst(val);
    }
    Node temp=head;
    while (temp.next!=null) {
        temp=temp.next;
    }
    temp.next=node;
    node.next=null;
    node.prev=temp;

   }
   //findng nnode
   public Node findeNode(int value){
    Node node=head;
    while (node!=null) {
        if(node.val==value){
            System.out.println("found");
            return node;
        }
        node=node.next;
        
    }
    return null;
}
public void insertafter(int after,int val){
    Node p=findeNode(after);
    if(p==null){
        System.out.println("node dosn't exist");
    }
    Node node=new Node(val);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null){
        node.next.prev=node;
    }
}
   public void display(){
    Node temp=head;
    Node last=head;
    while (temp!=null) {
     System.out.print(temp.val+"->");
        last=temp;
        temp=temp.next;
        
    }
    System.out.println("Printing in reverse");
    while (last!=null) {
        System.out.print(last.val+"->");
        last=last.prev;
    }


   }
  
  



   private class Node{
       private int val;
       private Node next;
       private Node prev;
         Node(int val){
            this.val=val;

         }
         Node(int val,Node next ,Node prev){
              this.val=val;
              this.next=next;
              this.prev=prev;
         }
    }
    
}
