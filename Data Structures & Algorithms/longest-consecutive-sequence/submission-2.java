class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int maxFreq = 1;
        int tempFreq = 1;
        for(int i = 1; i < nums.length; i++){
                if(nums[i]==nums[i-1]+1){
                    tempFreq++;
                }
                else if(nums[i]==nums[i-1]){
                    continue;
                }
                else{
                    tempFreq = 1;
                }

            maxFreq = Math.max(maxFreq, tempFreq);
        }

        return maxFreq;
    }
}
