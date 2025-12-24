//3074. Apple Redistribution into Boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int size = apple.length;

        int appleSum = 0;
        for(int i=0;i<size;i++){
            appleSum+=apple[i];
        }

        Arrays.sort(capacity);
        int count = 0;
        
        for(int i=capacity.length-1;i>=0;i--){
            int cap = capacity[i];
            if(appleSum-cap>0){
                appleSum-=cap;
                count+=1;
            }else{
                count+=1;
                break;
            }
        }
        return count;
    }
}