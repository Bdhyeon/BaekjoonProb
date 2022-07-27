class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j])
                    match++;
            }    
        }
        
        int low = 7 - match;
        low = low == 7 ? 6 : low;
        
        int high = 7 - match - zero;
        high = high == 7 ? 6 : high;
        
        int[] answer = {high, low};
        return answer;
    }
}