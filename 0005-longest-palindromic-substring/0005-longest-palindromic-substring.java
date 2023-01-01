class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            String odd = expandAroundCenter(s, i, i);
            if (odd.length() > result.length()) {
                result = odd;
            }

            // Even length palindromes
            String even = expandAroundCenter(s, i, i + 1);
            if (even.length() > result.length()) {
                result = even;
            }
        }

        return result;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Substring excludes the last invalid character
        return s.substring(left + 1, right);
    }
}
