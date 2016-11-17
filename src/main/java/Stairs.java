import java.util.HashMap;
import java.util.Map;

/**
 * Created by anujparikh on 11/16/16.
 */
public class Stairs {
    public void printStairs(int n) {

        Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            mapping.put(i, n - i);
        }

        mapping.forEach((k, v) -> {
            for (int i = 0; i < n; i++) {
                if (i < v) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        });


        for (int i = 0, k = 5; i < n; i++, k--) {
            for (int j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
