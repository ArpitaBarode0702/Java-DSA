package DoublyLinkList;

public class Main {
    public static void main(String[] args) {
        DLL dlist =new DLL();
        // dlist.addatfirst(11);
        // dlist.addatfirst(12);
        // dlist.addatfirst(13);
        // dlist.addatfirst(14);
        // dlist.display();
        dlist.addatlast(15);
        dlist.addatlast(16);
        dlist.insertafter(16, 55);
        dlist.display();
    }
    
}
