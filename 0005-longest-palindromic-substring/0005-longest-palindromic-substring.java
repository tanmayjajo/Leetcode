class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Preprocess the string to handle even length palindromes
        String t = preprocess(s);
        int n = t.length();
        int[] p = new int[n];
        int c = 0;
        int r = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * c - i;

            // Update p[i] using p[mirror]
            p[i] = (r > i) ? Math.min(r - i, p[mirror]) : 0;

            // Attempt to expand palindrome centered at i
            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            // Update c and r if palindrome centered at i expands past r
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
        }

        // Find the longest palindromic substring
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Calculate the start and end indices of the longest palindromic substring
        int start = (centerIndex - 1 - maxLen) / 2;
        int end = start + maxLen;

        return s.substring(start, end);
    }

    // Preprocess the string to handle even length palindromes
    private String preprocess(String s) {
        int n = s.length();
        if (n == 0) {
            return "^$";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^");
        for (int i = 0; i < n; i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#$");
        return sb.toString();
    }
}
