class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int yak = 1;
        int bae = 1;
        
        for(int i=Math.min(n,m); i > 0; i--){
            if(n%i==0 && m%i==0){
                yak = i;
                break;
            }
        }
        
        // for(int i=Math.max(n,m); ; i+=i){
        //     if(i%Math.min(n,m)==0){
        //         bae = i;
        //         break;
        //     }
        // }
        
        answer[0] = yak;
        answer[1] = (int)(n * m / yak);
        
        return answer;
    }
}