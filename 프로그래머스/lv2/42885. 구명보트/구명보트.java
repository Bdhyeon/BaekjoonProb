import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int small = 0;
        
        for(int i=people.length - 1; i>=0; i--){
            if(people[i] == 0)
                break;
            
            if(people[i] + people[small] <= limit){
                people[small] = 0;
                small++;
            }
            
            answer++;
        }
        
        return answer;
    }
}