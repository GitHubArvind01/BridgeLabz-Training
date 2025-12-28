
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;

        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(heights[i]!=temp[i]){
                count++;
            }
        }
        return count;
    }
}