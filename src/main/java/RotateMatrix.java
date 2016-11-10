/**
 * Created by anujparikh on 11/8/16.
 */
public class RotateMatrix {
    public char[][] rotateMxNMatrix(char[][] inputMatrix) {
        int x = inputMatrix.length - 1;
        int y = inputMatrix[0].length - 1;
        char[][] outputMatrix = new char[inputMatrix.length][inputMatrix[0].length];
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                outputMatrix[i][j] = inputMatrix[j][y - i];
            }
        }
        return outputMatrix;
    }
}
