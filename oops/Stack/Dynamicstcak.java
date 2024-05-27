package Stack;

public class Dynamicstcak extends Customstack {
    //in this we only need to double the size array when array is full during th push operation bcz internally arraylist do the same
    Dynamicstcak(){
      super();
    }
    Dynamicstcak(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(isfull()){
            int[] temp=new int[data.length*2];
           for(int i=0;i<data.length;i++){
                temp[i]=data[i];
           }
           data=temp;
        }
        return super.push(item);

    }
}
