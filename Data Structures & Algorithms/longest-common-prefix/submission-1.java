class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcf = "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        int count = 0;
        for(int i = 0; i < Math.min(first.length, last.length); i++){
            if(first[i]!=last[i]){
                break;
            }
            count++;
        }
        for(int i = 0; i < count; i++){
            lcf += first[i];
        }
        return lcf;
    }
}