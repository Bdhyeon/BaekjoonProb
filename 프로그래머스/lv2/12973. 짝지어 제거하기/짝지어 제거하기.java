import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack stack = new Stack();
        stack.push('0');
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            char temp = (char)stack.pop();
            if(temp != arr[i]){
                stack.push(temp);
                stack.push(arr[i]);
            }
            //System.out.println(temp);
        }
        
        return stack.size() == 1 ? 1 : 0;
    }
}