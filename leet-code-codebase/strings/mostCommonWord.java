//819. Most Common Word
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z, ]", "");
        String[] words = paragraph.split("[,\\s]+");


        for(int i=0;i<words.length;i++){
            String temp = words[i].toLowerCase();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        
        String result = "";
        int max = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();

            if(solve(word, banned) && count > max){
                max = count;
                result = word;
            }
        }

        return result;
    }
    public static boolean solve(String s, String arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(s)){
                return false;
            }
        }
        return true;
    }
}