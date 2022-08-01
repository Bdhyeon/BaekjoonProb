import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] user = new String[2];
        HashSet<String> set = new HashSet<String>();
        HashMap<String, Integer> from = new HashMap<String, Integer>();
        HashMap<String, Integer> to = new HashMap<String, Integer>();
        
        for(int i=0; i<report.length; i++){
            if(!set.contains(report[i])){
                user = report[i].split(" ");
                // 중복 신고 제외
                set.add(report[i]);
                
                // 신고당한 횟수 저장
                int reportNum = to.containsKey(user[1]) ? to.get(user[1]) + 1 : 1;
                to.put(user[1], reportNum);
            }
        }
        
        for(String data : set){
            user = data.split(" ");
            // 유효 신고한 횟수 저장
            if(to.get(user[1]) >= k){
                int valReport = from.containsKey(user[0]) ? from.get(user[0]) + 1 : 1;
                from.put(user[0], valReport);
            }
        }
        
        
        for(int i=0; i<answer.length; i++){
            answer[i] = from.containsKey(id_list[i]) ? from.get(id_list[i]) : 0;
        }
        
        return answer;
    }
}