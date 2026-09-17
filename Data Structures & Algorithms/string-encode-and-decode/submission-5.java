class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        String encoded = "";

        for(int i  = 0; i < strs.size(); i++){
            
            String s = strs.get(i);
            if(!s.isEmpty()){
                if(i==strs.size()-1){
                encoded += s;
                }else{
                encoded += s+"136";
                }
            }else{
                if(i==strs.size()-1){
                encoded += "*";
                }else{
                encoded+="*136";
                }
            }
        }

        return encoded;
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return List.of();
        String[] arr = str.split("136");
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("*")){
                arr[i] = "";
            }
            list.add(arr[i]);
        }

        return list;
    }
}
