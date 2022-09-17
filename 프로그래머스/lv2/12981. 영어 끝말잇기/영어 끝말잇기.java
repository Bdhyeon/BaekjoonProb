import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        char beforeC = words[0].charAt(0);
        
        for(int i=0; i<words.length; i++){
            String tempWord = words[i];
            if(!list.contains(tempWord) && tempWord.charAt(0) == beforeC){
                list.add(tempWord);
                beforeC = tempWord.charAt(tempWord.length()-1);
            }else{
                answer[0] = i % n + 1;
                answer[1] = (i+1) % n == 0 ? (i+1) / n : (i+1) / n + 1;
                break;
            }
        }

        return answer;
    }
}