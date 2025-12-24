class Solution {
    public int removeElement(int[] nums, int val) {
       

       int n = nums.length;
       int count = 0;
       for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i] = 0;
                count++;
            }
       }
       return n-count;
    }
}