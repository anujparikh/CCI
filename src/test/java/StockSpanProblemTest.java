import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class StockSpanProblemTest {

    @Test
    public void calculateStockSpanTest() {
        StockSpanProblem testObject = new StockSpanProblem();
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] calculatedSpan = testObject.calculateStockSpan(input);
        for (int i = 0; i < calculatedSpan.length; i++) {
            System.out.println((i + 1) + " ---> " + calculatedSpan[i]);
        }
    }


}
