class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(Map.Entry<Integer,Integer> emt : map.entrySet()){
            int temp = emt.getValue();
            if(max<temp){
                max = temp;
                ans = emt.getKey();
            }
        }
        return ans;
    }
}