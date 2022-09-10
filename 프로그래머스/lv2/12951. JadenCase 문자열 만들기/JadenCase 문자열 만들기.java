class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();
        boolean firstOrNot = true;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                firstOrNot = true;
            }else{
                if(firstOrNot){
                    arr[i] = Character.toUpperCase(arr[i]);
                    firstOrNot = false;
                }else{
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
            
            answer.append(arr[i]);
        }
        
        return answer.toString();
    }
}