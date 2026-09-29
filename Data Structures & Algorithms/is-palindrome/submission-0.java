class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String rs = new StringBuilder(ss).reverse().toString();

        return ss.equals(rs);
    }
}
