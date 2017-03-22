/**
 * Created by john on 3/21/17.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);
        list.insertAtHead(21);

        System.out.println(list);
    }
}
