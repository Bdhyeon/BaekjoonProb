import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = citations.length;
        
        for(int i=citations.length - 1; i>=0; i--){
            int hIndex = citations.length - i;
            if(hIndex == citations[i]){
                answer = hIndex; break;
            }else if(hIndex > citations[i]){
                answer = hIndex - 1; break;
            }
        }
        
        return answer;
    }
}