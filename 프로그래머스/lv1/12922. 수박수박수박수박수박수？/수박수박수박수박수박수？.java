class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            char c = i % 2 == 0 ? '수' : '박';
            sb.append(c);
        }
        
        return sb.toString();
    }
}