class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            map.putIfAbsent(st, new ArrayList<>());
            map.get(st).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
