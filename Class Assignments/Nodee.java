/**
 * Created by Jnolc on 5/9/2017.
 */
public class Nodee {

    private String name;
    private Nodee next;

    public Nodee () {
        name = " ";
        next = null;
    }

    public Nodee(String name) {
        this.name = name;
    }

    public Nodee(Nodee next) {
        this.next = next;
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

    public void setNext(Nodee next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
