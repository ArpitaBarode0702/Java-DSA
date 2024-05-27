package Stack;

public class Customstack {
   protected int[] data;
   private static final int Default_size=10;
   int ptr=-1;

   Customstack(int size){
    this.data=new int[size];

   }
   Customstack(){
    this(Default_size);
   }
   public boolean push(int item){
    if(isfull()){
        System.out.println("Stack is full");
        return false;
    }
    ptr++;
    data[ptr]=item;
    return true;
    
   }
   public int pop(){
    if(isempty()){
        System.out.println("No item in stack");
    }
    int removed=data[ptr];
    ptr--;
    return removed;
   }
   boolean isfull(){
    return ptr==data.length-1;
   }
   boolean isempty(){
    return ptr==-1;
   }

    
}
