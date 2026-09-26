class Solution {
    public int firstMissingPositive(int[] nums) {
        int i;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        
        i = 1;
        while(i <= nums.length){
            if(set.contains(i)){
                i++;
            }else{
                return i;
            }
        }

        return i;
    }
}