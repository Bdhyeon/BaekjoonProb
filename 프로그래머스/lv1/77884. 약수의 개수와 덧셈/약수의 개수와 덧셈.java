class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            if(chk(i)){
                answer += i;
            }else{
                answer -= i;
            }
        }
        
        return answer;
    }
    
    public boolean chk(int num){
        boolean chk = false;
        for(int i=1; i<num; i++){
            if(num%i == 0) chk = !chk;
        }
        return chk;
    }
}