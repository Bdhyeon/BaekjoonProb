class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            answer[0]++;
            answer[1] += s.length();
            s = s.replace("0", "");
            answer[1] -= s.length();
            
            StringBuilder s2 = new StringBuilder();
            int length = s.length();
            while(length > 0){
                s2.insert(0, length%2);
                length /= 2;
            }
            
            s = s2.toString();
        }
        
        return answer;
    }
}