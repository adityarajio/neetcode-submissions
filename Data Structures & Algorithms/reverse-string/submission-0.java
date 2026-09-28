class Solution {
    public void reverseString(char[] s) {
        char[] c = new char[s.length];
        int count = 0;
        for(int i = s.length-1; i >=0; i--, count++){
            c[count] = s[i];
        }

        for(int i = 0; i < s.length; i++){
            s[i] = c[i];
        }
    }
}