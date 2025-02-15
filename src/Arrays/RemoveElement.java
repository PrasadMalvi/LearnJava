import java.util.Arrays;

class Solution1 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; 
                count++;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, count)));
        return count;
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = sol.removeElement(nums, val);
        System.out.println("New length: " + newLength);
    }
}
