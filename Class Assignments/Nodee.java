/**
 * Created by Jnolc on 5/9/2017.
 */
public class Nodee {

    private String name;
    private Nodee next;
    private Nodee prev;

    public Nodee () {
        name = " ";
        next = null;
        prev = null;
    }

    public Nodee(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nodee getNext() {
        return next;
    }

    public Nodee getPrev() {
        return prev;
    }

    public void setNext(Nodee next) {
        this.next = next;
    }

    public void setPrev(Nodee prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
