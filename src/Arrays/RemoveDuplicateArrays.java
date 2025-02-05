package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

class SolutionBuiltIn {
    public int usingBuiltIn(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for (int num : nums) {
            newSet.add(num);
        }
        return newSet.size();
    }
}

public class RemoveDuplicateArrays {
    public static void main(String[] args) {
    	
    	int nums[] = {1, 1, 2, 6, 3, 2, 3};
    	Arrays.sort(nums);
    	Solution s1 = new Solution();
        int result = s1.removeDuplicates(nums);  // Remove duplicates and get count
        
        // Output the number of unique elements
        System.out.println("Number of Unique Ele: " + result);
        
        // Output the unique elements, which are now at the start of the array
        System.out.println("Unique Element are:");
        for (int i = 0; i < result; i++) {  // Print only the first 'result' elements
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        SolutionBuiltIn s2 = new SolutionBuiltIn();
        int result1 = s2.usingBuiltIn(nums);
        System.out.println("Number of unique elements: " + result1);
        System.out.println("Unique Element are:");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
