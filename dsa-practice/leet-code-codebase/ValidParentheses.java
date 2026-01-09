//20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<n){
            char left = s.charAt(i);

            if(left=='[' || left=='(' || left=='{'){
                stack.push(left);
            }
            else{
                char right = stack.peek();
                if(
                    (right==l)
                )
            }
        }
    }
}