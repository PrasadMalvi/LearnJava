package Strings;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String testString = "abcabcbb";
        int result = sol.lengthOfLongestSubstring(testString);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
