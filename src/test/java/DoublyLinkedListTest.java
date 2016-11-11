import org.junit.Test;

/**
 * Created by anujparikh on 11/9/16.
 */
public class DoublyLinkedListTest {

    @Test
    public void printListTest() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.head = new DoublyLinkedList.Node(1);
        DoublyLinkedList.Node second = new DoublyLinkedList.Node(2);
        DoublyLinkedList.Node third = new DoublyLinkedList.Node(3);
        dll.head.next = second;
        second.next = third;
        second.previous = dll.head;
        dll.push(4);
        dll.insertAfter(second, 6);
        dll.insertBefore(second, 12);
        dll.append(10);
        dll.printList();
    }
}
