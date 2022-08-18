class Solution {
    public long[] solution(long n) {
        int log = (int)Math.log10(n) + 1;
        long[] answer = new long[log];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = n % 10;
            n /= 10;
        }
        
        System.out.println(log);
        return answer;
    }
}