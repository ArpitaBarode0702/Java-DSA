package CircularLinkList;

public class Main {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insertt(1);
        list.insertt(2);
        list.insertt(3);
        list.insertt(4);
        list.delete(2);
        list.display();
    }
}
