class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcf = "";
        String first = strs[0];
        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            boolean match = true;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || ch != strs[j].charAt(i)){
                    match = false;
                    break;
                }
            }
            if(!match){
                break;
            }
            else{
                lcf += strs[0].charAt(i);
            }
        }
        return lcf;
    }
}