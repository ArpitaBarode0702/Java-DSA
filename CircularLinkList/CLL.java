package CircularLinkList;

public class CLL {
  Node head;
  Node tail;

  CLL(){
    head=null;
    tail=null;

  }

  //add at first
  public void insertt(int val){
    Node node=new Node(val);
    if(head==null){
        head=node;
        tail=node;

    }
    node.next=head;
    tail.next=node;
    tail=node;
  }
//delete node
public void delete(int val){
    Node node=head;
    if(node==null){
        return;
    }
    if(node.val==val){
        head=head.next;
        tail.next=head;
    }
    do{
        Node n=node.next;
        if(n.val==val){
            node.next=n.next;
            break;
        }
        node=node.next;
    }while(node!=head);
}

  //display
  public void display(){
    Node temp=head;
    if(head!=null){
        do{
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp.next!=head);
    }
  }

   private class Node{
      private int val;
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
