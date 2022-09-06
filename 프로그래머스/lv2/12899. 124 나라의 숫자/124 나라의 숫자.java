class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int[] numbers = {1, 2, 4};
        
        while(n>0){
            answer.insert(0, numbers[(n-1)%3]);
            n = (n-1)/3;
        }
        
        return answer.toString();
    }
}