class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            if(list.contains(num)) continue;
            if(map.get(num)>(nums.length/3)){
                list.add(num);
            }
        }
        return list;
    }
}