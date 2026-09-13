class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        for(int i = 0; i < nums.length; i++){
            if(i>0){
                if(nums[i]!=nums[i-1]){
                    freq = 1;
                    continue;
                }
            }
            if(i>0) freq++;
            if(freq>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}