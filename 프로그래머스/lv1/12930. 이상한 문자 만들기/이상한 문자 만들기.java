class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toLowerCase().toCharArray();
        int chk = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                chk = 0;
                answer += ' ';
                continue;
            }
            arr[i] = chk % 2 == 0 ? (char)(arr[i] - 32) : arr[i];
            answer += arr[i]; 
            chk++;
        }
        
        return answer;
    }
}