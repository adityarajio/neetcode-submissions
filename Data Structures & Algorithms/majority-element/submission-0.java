class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int temp = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(i!=0 && temp==nums[i]) continue;
            int count = 1;
            temp = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                majority = nums[i];
            }
        }

        return majority;
    }
}