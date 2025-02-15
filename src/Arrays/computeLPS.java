class Solution3 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        
        int n = haystack.length(), m = needle.length();
        int[] lps = computeLPS(needle);
        
        int i = 0, j = 0;
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == m) return i - m;  // Found match
            } else if (j > 0) {
                j = lps[j - 1]; // Skip redundant comparisons
            } else {
                i++;
            }
        }
        return -1;
    }
    
    private int[] computeLPS(String pattern) {
        int m = pattern.length(), len = 0, i = 1;
        int[] lps = new int[m];
        
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }
}
