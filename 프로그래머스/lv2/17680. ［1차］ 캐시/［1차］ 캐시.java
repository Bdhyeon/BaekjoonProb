import java.util.LinkedList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        
        for(int i=0; i<cities.length; i++){
            String data = cities[i].toUpperCase();
            int index = list.indexOf(data);
            if(index > -1){
                answer += 1;
                list.remove(index);
            }else{
                answer += 5;
            }
            
            list.add(data);
            if(list.size() > cacheSize){
                list.remove();
            }
        }
        
        return answer;
    }
}