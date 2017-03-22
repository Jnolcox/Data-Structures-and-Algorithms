/**
 * Created by john on 3/22/17.
 */
public class TowerOfHanoi {

    public void move(int numberOfDiscs, char from, char to, char inter) {

        if (numberOfDiscs == 1) {
            System.out.println("Moving Disc 1 from " + from + " to " + to);
        } else {
            move(numberOfDiscs-1, from, inter, to);
            System.out.println("Moving Disc " + numberOfDiscs + " from " + from + " to " + to);
            move(numberOfDiscs-1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        int numSteps = 0;
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(5, 'A', 'C', 'B');
        System.out.println();
    }
}
