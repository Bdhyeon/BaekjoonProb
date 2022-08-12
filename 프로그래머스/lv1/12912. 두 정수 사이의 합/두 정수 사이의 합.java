class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        for(long i=(long)Math.min(a, b); i<=(long)Math.max(a, b); i++){
            answer += i;
        }
        
        return answer;
    }
}