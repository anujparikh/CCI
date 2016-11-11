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
 * https://www.careercup.com/question?id=7902674
 */
public class LoneElementInArray {
    public int findElementThatAppearsOnce(int[] input) {
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < input.length; i++) {
            twos |= ones & input[i]; // add it to twos if it exists in ones
            ones ^= input[i]; // it exists in ones, remove it, otherwise, add it
            int not_threes = ~(ones & twos); //if current is in ones and twice, add it to Threes
            ones &= not_threes; //remove current from ones
            twos &= not_threes; //remove current from twos
        }
        return ones;
    }
}
