import org.junit.Test;

/**
 * Created by anujparikh on 11/9/16.
 */
public class CustomLinkedListTest {

    @Test
    public void printListTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(6);
        CustomLinkedList.Node second = new CustomLinkedList.Node(2);
        CustomLinkedList.Node third = new CustomLinkedList.Node(3);

        ll.head.next = second;
        second.next = third;

        ll.push(4);

        ll.append(6);
        ll.append(6);
        ll.append(6);

        ll.removeDuplicateThroughHashTable();

        System.out.println("search: " + ll.searchKey(6));
        System.out.println("search neg: " + ll.searchKey(19));
        System.out.println("count: " + ll.getCount());

        ll.printList();
    }

    @Test
    public void sortedInsertTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(2);
        ll.append(2);
        ll.append(3);
        ll.append(5);
        ll.append(6);
        ll.sortedInsert(4);
        ll.sortedInsert(1);
        ll.sortedInsert(7);
        ll.printList();
    }

    @Test
    public void insertionTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(2);
        ll.append(5);
        ll.append(3);
        ll.append(6);
        ll.append(4);
        ll.append(8);
//        ll.insertionSort();
        ll.printList();
    }

    @Test
    public void searchNthTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(2);
        ll.append(5);
        ll.append(3);
        ll.append(6);
        ll.append(4);
        ll.append(8);
        ll.printList();
        System.out.println("Last nth data: " + ll.searchNthFromLastElement(6));
    }

    @Test
    public void addTwoLinkedList() {
        CustomLinkedList ll1 = new CustomLinkedList();
        ll1.head = new CustomLinkedList.Node(3);
        ll1.append(1);
        ll1.append(5);
        CustomLinkedList ll2 = new CustomLinkedList();
        ll2.head = new CustomLinkedList.Node(5);
        ll2.append(9);
        ll2.append(5);
        new CustomLinkedList().addTwoLL(ll1, ll2).printList();
    }

    @Test
    public void searchFirstNodeInLoop() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(3);
        ll.append(1);
        ll.append(5);
        ll.append(8);
        ll.printList();
        System.out.println(ll.head.next.next.next.data + ": " + ll.head.data);
        ll.head.next.next.next = ll.head;
        System.out.println(ll.head.next.next.next.next.data + ": " + ll.head.data);
        System.out.println(ll.searchFirstNodeInLoop().data);
    }

    @Test
    public void deleteLastKeyTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(3);
        ll.append(1);
        ll.append(5);
        ll.append(5);
        ll.append(8);
        ll.deleteLastOccurrence(5);
        ll.printList();
    }

    @Test
    public void reverseLinkedListTest() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.head = new CustomLinkedList.Node(3);
        ll.append(1);
        ll.append(5);
        ll.append(5);
        ll.append(8);
        System.out.println("Before: ");
        ll.printList();
        ll.reverseLinkedList();
        System.out.println("After: ");
        ll.printList();
    }
}
