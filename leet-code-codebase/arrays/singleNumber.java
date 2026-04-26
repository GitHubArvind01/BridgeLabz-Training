class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> emt : map.entrySet()){
            if(emt.getValue()==1){
                ans = emt.getKey();
                break;
            }
        } 
        return ans;
    }
}