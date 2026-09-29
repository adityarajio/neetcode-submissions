class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }else{
            for(int i = 0; i < s.length(); i++){
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);
                String temp = sb.toString();
                if(isPalindrome(temp)) return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else{
                if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}