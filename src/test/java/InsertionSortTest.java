import org.junit.Test;

/**
 * Created by anujparikh on 11/10/16.
 */
public class InsertionSortTest {
    @Test
    public void insertionSortTest() {
        int[] testInput = {12, 11, 13, 5, 6, 4, 15};
        InsertionSort input = new InsertionSort();
        input.sort(testInput);
        for (int aTestInput : testInput) {
            System.out.println(aTestInput);
        }
    }
}
