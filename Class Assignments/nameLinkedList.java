import java.util.Scanner;

/**
 * Created by Jnolc on 5/9/2017.
 */
public class nameLinkedList {
    /**
     * Implement linked list for names, print out the list
     * Implement a print method for the names in reverse
     *
     * Implement recursive versions
     */
    private Nodee head;

    public void insertAtHead (Nodee name) {
        Nodee newNode = new Nodee (name);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void deleteAtHead (Nodee name) {
        this.head = this.head.getNext();
    }

    public void listNames() {
        Nodee temp = head;
        System.out.println(temp.getName() + " ");
        while (temp.getNext() != null) {
            temp = temp.getNext();
            System.out.println(temp.getName() + " ");
        }
    }

    public void revListNames() {

    }

    public static void main(String[] args) {
        nameLinkedList nameLinkedList = new nameLinkedList();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Name \n Hitting enter without" +
                "a name will end the program. \r");
        if (kb.nextLine() != null) {
            String name = kb.nextLine();
            nameLinkedList.insertAtHead(new Nodee(name));
            kb.nextLine();//consume next line
        }

        nameLinkedList.listNames();
    }
}
