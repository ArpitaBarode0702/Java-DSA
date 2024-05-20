package Linklist;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.interFIrstelem(12);
        list.interFIrstelem(13);
        list.interFIrstelem(14);
        list.interFIrstelem(15);
        list.addatlast(11);
        list.addatindex(22,2);
        System.out.println(list.deletefirst());
       
       list.addatlast(51);
       System.out.println(list.deleteLast());
        list.display();
        // System.out.println("Adding at first"+list.size);
       
        // list.display();
    }
}
