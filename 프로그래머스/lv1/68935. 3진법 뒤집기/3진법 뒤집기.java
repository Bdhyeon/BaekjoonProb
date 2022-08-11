class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            sb.append(n % 3);
            n /= 3;
            if(n == 0)
                break;
        }
        
        for(int i=sb.length()-1; i>=0; i--){
            int num = Integer.parseInt(String.valueOf(sb.charAt(sb.length()-1-i)));
            answer += Math.pow(3, i) * num;
        }
        
        return answer;
    }
}