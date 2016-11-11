/**
 * Created by anujparikh on 11/11/16.
 */

/**
 * Google Interview Question
 * You are given an array that contains integers. The integers content is such that every integer occurs 3 times
 * in that array leaving one integer that appears only once. Fastest way to find that single integer
 * -- using memory.
 * -- not using any external memory.
 * eg: [2,1,4,5,1,4,2,2,4,1]
 */
public class LoneElementInArray {
    public int findElementThatAppearsOnce(int[] input) {
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < input.length; i++) {
            twos |= ones & input[i];
            ones ^= input[i];
            int not_threes = ~(ones & twos);
            ones &= not_threes;
            twos &= not_threes;
        }
        return ones;
    }
}
