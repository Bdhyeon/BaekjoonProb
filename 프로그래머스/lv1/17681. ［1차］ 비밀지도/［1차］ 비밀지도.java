class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if(toTwo(n, arr1[i]).charAt(j) == '0' && toTwo(n, arr2[i]).charAt(j) == '0')
                    sb.append(' ');
                else
                    sb.append('#');
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
    
    public String toTwo(int n, int str){
        String s = Integer.toBinaryString(str);
        if(s.length() != n){
            while(s.length() != n)
                s = "0" + s;
        }
        return s;
    }
}