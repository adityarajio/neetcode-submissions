class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int l1 = 0;
        int l2 = 0;
        while(l1 < word1.length() || l2 < word2.length()){
            if(l1 < word1.length()){
                s.append(word1.charAt(l1));
                l1++;
            }

            if(l2<word2.length()){
                s.append(word2.charAt(l2));
                l2++;
            }
        }

        return s.toString();
    }
}