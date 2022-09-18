import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack();
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            char temp = arr[i];
            if(stack.size() == 0){
                stack.push(temp);
            }else if(stack.peek() == temp){
                stack.pop();
            }else{
                stack.push(temp);
            }
        }
        
        return stack.size() == 0 ? 1 : 0;
    }
}