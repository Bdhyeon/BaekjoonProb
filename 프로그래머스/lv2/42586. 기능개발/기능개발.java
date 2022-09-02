import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        
        int day = 0;
        int chk = 0;
        
        for(int i=0; i<progresses.length; i++){
            int val = progresses[i] + (day * speeds[i]);
            if(val >= 100){
                map.put(day, ++chk);
            }else{
                day++;
                i--;
                chk = 0;
            }
        }
        
        int[] answer = new int[map.size()];
        int index = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            answer[index] = entry.getValue();
            index++;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        return answer;
    }
}