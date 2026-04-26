//20. Valid Parentheses of problem

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<n){
            char left = s.charAt(i);

            if(left=='[' || left=='(' || left=='{'){
                stack.apush(left);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char right = stack.peek();
                if(
                    (left==']' && right=='[') ||
                    (left=='}' && right=='{') || 
                    (left==')' && right=='(')
                ){
                    stack.pop();
                }else{
                    return false;
                }
            }
            i+=1;
        }
        return stack.isEmpty()?true:false;
    }
}