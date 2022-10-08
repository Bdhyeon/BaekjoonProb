class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babblings = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            String temp = babbling[i];
            for(int j=0; j<babblings.length; j++){
                temp = convertBabbling(temp, babblings[j]);
            }
            if(temp.length() == 0)
                answer++;
        }
        
        return answer;
    }
    
    public String convertBabbling(String temp, String babbling){
        if(!temp.contains(babbling + babbling)){
            return temp.replace(babbling, "");
        }else{
            return temp;
        }
    }
    
}