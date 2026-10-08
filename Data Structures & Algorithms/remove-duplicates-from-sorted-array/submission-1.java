class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }
        int count = 0;
        for(int num: map.keySet()){
            nums[count] = num;
            count++;
        }
        Arrays.sort(nums, 0, count);

        return map.size();
        
    }
}