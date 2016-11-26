import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by anujparikh on 11/21/16.
 */
public class SetOfNumsWithSum {

    public static class Node {
        int data;
        int index;

        Node(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }

    public static void getPairOfNosWithInputArrayAndSum(int[] input, int sum) {
        Arrays.sort(input);
        for (int i = 0, j = input.length - 1; i < j; ) {
            if (input[i] + input[j] < sum) i++;
            else if (input[i] + input[j] > sum) j--;
            else {
                System.out.println("Pair is: " + input[i] + " & " + input[j]);
                return;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> threePair = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1, k = nums.length - 1; j < k;  ) {
                if (nums[i] + nums[j] + nums[k] < 0) j++;
                else if (nums[i] + nums[j] + nums[k] > 0) k--;
                else {
                    threePair.add(nums[i]);
                    threePair.add(nums[j]);
                    threePair.add(nums[k]);
                    output.add(threePair);
                }
            }
        }
        return output;
    }

    public static int[] getIndexOfPairOfNosWithInputArrayAndSum(int[] nums, int target) {
        Node[] inputNodeArray = new Node[nums.length];

        for (int i = 0; i < nums.length; i++) {
            inputNodeArray[i] = new Node(nums[i], i);
        }

        Arrays.sort(inputNodeArray, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.data, o2.data);
            }
        });

        int[] output = new int[2];

        for (int i = 0, j = inputNodeArray.length - 1; i < j; ) {
            if (inputNodeArray[i].data + inputNodeArray[j].data < target) i++;
            else if (nums[i] + nums[j] > target) j--;
            else {
                output[0] = i;
                output[1] = j;
                return output;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 3, 6, 9, 7, 8};
        List<int[]> abce = new ArrayList<>();
        getPairOfNosWithInputArrayAndSum(input, 15);
    }
}
