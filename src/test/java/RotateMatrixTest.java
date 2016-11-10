import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/8/16.
 */
public class RotateMatrixTest {

    @Test
    public void whenInputMxNMatrixThenRotateBy90Degree() {
        char[][] inputMatrix = {{'a', 'b', 'c', 'd'}, {'z', 'e', 'f', 'g'}, {'h', 'i', 'j', 'k'}, {'l', 'm', 'n', 'o'}};
        char[][] expectedOutputMatrix = {{'d', 'g', 'k', 'o'}, {'c', 'f', 'j', 'n'}, {'b', 'e', 'i', 'm'}, {'a', 'z', 'h', 'l'}};
        RotateMatrix testInput = new RotateMatrix();
        Assert.assertArrayEquals(expectedOutputMatrix, testInput.rotateMxNMatrix(inputMatrix));
    }
}
