class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[k];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                map.put(nums[i-1], count);
                count = 1;
            }
        }
        map.put(nums[nums.length - 1], count);


        for(int i = 0; i < k; i++){
            int maxFreq = 0;
            int maxKey = 0;
            for(int num: map.keySet()){
                if(map.get(num)>maxFreq){
                    maxFreq = map.get(num);
                    maxKey = num;
                }
            }

            arr[i] = maxKey;
            map.remove(maxKey);
        }
        return arr;
    }
}
