import org.junit.Test;

/**
 * Created by anujparikh on 11/10/16.
 */
public class CircularLinkedListTest {

    @Test
    public void printListTest() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.first = new CircularLinkedList.Node(2);
        CircularLinkedList.Node second = new CircularLinkedList.Node(5);
        CircularLinkedList.Node third = new CircularLinkedList.Node(8);
        cll.first.next = second;
        second.next = third;
        third.next = cll.first;
        cll.sortedInsert(7);
        cll.sortedInsert(0);
        cll.sortedInsert(-1);
        cll.sortedInsert(7);
        cll.sortedInsert(1);
        cll.sortedInsert(1);
        cll.sortedInsert(9);
        cll.sortedInsert(9);
        cll.printList();
    }

    @Test
    public void startingWithEmptyNodeTest() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.sortedInsert(2);
        cll.printList();
    }
}
