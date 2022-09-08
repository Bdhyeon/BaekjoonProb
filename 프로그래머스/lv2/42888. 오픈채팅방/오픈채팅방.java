import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>(); //유저 정보 저장
        List<String> list = new ArrayList<>(); //채팅방 로그 저장
        
        for(int i=0; i<record.length; i++){
            String[] record2 = record[i].split(" ");
            switch(record2[0]){
                case "Enter":
                    map.put(record2[1], record2[2]);
                    list.add(record2[1] + " 들어왔습니다."); break;
                case "Leave":
                    list.add(record2[1] + " 나갔습니다."); break;
                case "Change":
                    map.put(record2[1], record2[2]); break;
            }
        }
        
        String[] answer = new String[list.size()]; //최종 채팅방 로그
        for(int i=0; i<list.size(); i++){
            String[] arr = list.get(i).split(" ");
            answer[i] = map.get(arr[0]) + "님이 " + arr[1];
        }
        
        return answer;
    }
}