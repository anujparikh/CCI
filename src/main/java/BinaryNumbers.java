import java.util.ArrayDeque;

/**
 * Created by anujparikh on 11/18/16.
 */
public class BinaryNumbers {

    public static void main(String[] args) {
        int n = 20;
        int i = 0;
        ArrayDeque<String> binaryQueue = new ArrayDeque<>();
        binaryQueue.add("1");
        while (i < n) {
            System.out.println("Start Queue: " + binaryQueue);
            String s1 = binaryQueue.peekFirst();
            binaryQueue.pop();
            System.out.println("After Queue: " + binaryQueue);
            System.out.println((i + 1) + " ---> " + s1);

            binaryQueue.add(s1 + "0");
            binaryQueue.add(s1 + "1");
            System.out.println("Final Queue: " + binaryQueue);
            System.out.println("\n\n\n");
            i++;
        }
    }
}
