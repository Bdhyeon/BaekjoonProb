class Solution {
    public long solution(int n) {
        long answer = 0;
        long temp = 1;
        long before = 0;
        
        for(int i=0; i<n; i++){
            answer = temp + before;
            before = temp % 1234567;
            temp = answer % 1234567;
        }
        
        return answer % 1234567;
    }
}