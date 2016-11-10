import org.junit.Test;

/**
 * Created by anujparikh on 11/9/16.
 */
public class LinkedListTest {

    @Test
    public void printListTest() {
        LinkedList ll = new LinkedList();
        ll.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        ll.head.next = second;
        second.next = third;

        ll.push(4);

        ll.insertAfter(second, 5);

        ll.append(6);

        ll.printList();
    }
}
