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
    private Nodee tail;

    public void insertAtHead (String name) {
        Nodee newNode = new Nodee (name); // create a new node

        if ( this.head == null ) {
            this.tail = newNode;
        }

        if (this.head != null) {
            this.head.setNext(newNode);
        }

        this.head = newNode;

        //newNode.setNext(this.head); // no other node exist so set the next node to itself (null)
        //this.head = newNode; // point to first node as head
    }

    public void deleteAtHead (Nodee name) {
        this.head = this.head.getNext();
    }

    public void listNames() {
        Nodee temp = head; // temporary node is pointing to head of list
        while (temp != null ) {   // while the next pointer is pointing to another node
            System.out.print(temp.getName() + " "); // print the name of this next node
            temp = temp.getNext(); // set the temp node to point to the next node in the list
        }
    }

    public void revListNames() {
        Nodee temp = head; //set the pointer to the head of the list

        //set the pointer to the tail of the list
        while(temp.getNext()!= null) { //while there is another node do the following:

            do {  //do this:
                temp = temp.getNext(); //set the pointer to the next node
            } while (temp.getNext() != null); // only while there is another node to set it to

            //the pointer should be on the last node now
            System.out.print(temp.getName() + " "); //print the tail of the node
            temp = temp.getPrev(); //set the pointer to the one before the current node
            temp.setNext(null); //set the next node to point to nothing
        }
    }

    public static void main(String[] args) {
        nameLinkedList listOfNames = new nameLinkedList(); // create a new linked list named listOfNames
        Scanner input = new Scanner(System.in); // create the method of capturing the input
        String name; //initialize the string

        System.out.print("Press Enter to end program \n" +
                "Enter Names : \n\r "); // tell the user what to enter

        do{
            name = input.nextLine(); // set the String to the new name entered on the keyboard

            if (!name.isEmpty()) { //if the name entered isn't empty
                listOfNames.insertAtHead(name); // create a new node and place the name in it
            }

        } while ( !name.isEmpty() ); //while the name isn't empty, repeat

        listOfNames.listNames(); // print the names in the list
        System.out.println();
        listOfNames.revListNames();
    }
}
