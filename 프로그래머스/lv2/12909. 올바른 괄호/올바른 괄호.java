import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack left = new Stack();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                left.push('(');
            }else{
                if(left.isEmpty()){
                    answer = false;
                }else{
                    left.pop();
                }
            }
        }
        
        answer = left.isEmpty() ? answer : false;
        
        return answer;
    }
}