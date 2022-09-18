class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[]{0,0};
        
        for(int i=1; i<=Math.sqrt(yellow); i++){
            if(((yellow / i) * 2 + (i * 2) + 4) == brown){
                answer[0] = yellow / i + 2;
                answer[1] = i + 2;
            }
        }
        
        return answer;
    }
}