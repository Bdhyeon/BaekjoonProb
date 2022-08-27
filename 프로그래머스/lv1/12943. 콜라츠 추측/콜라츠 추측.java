class Solution {
    public int solution(int num) {
        int answer = 0;
        long numl = num;
        
        if(numl != 1){
            while(numl > 1){
                numl = numl % 2 == 0 ? numl / 2 : numl * 3 + 1;
                answer++;
                if(answer == 500){
                    answer = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}