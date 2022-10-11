class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=9; i>=0; i--){
            String temp = String.valueOf(i);
            int num = Math.min(X.length() - X.replace(temp, "").length(), Y.length() - Y.replace(temp, "").length());
            
            if(i == 0 && answer.length() == 0){
                answer = num > 0 ? answer.append("0") : answer.append("-1");
            }else{
                for(; num > 0; num--)
                    answer.append(temp);
            }
        }
        
        return answer.toString();
    }
}