class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long copyX = x;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = copyX;
            copyX += x;
        }
        
        return answer;
    }
}