class Solution {
    public int solution(String s) {
        int length = s.length();
        int answer = length;
        
        for(int i=1; i<=length/2; i++){
            String copyS = s;
            StringBuilder resultS = new StringBuilder();
            int cnt = 1; //반복되는 횟수 카운트
            
            while(copyS.length()>i){
                String subsS = copyS.substring(0, i);
                copyS = copyS.substring(i);
                
                //압축되는 문자열이 있을 경우 반복횟수+1, 없을경우 횟수 초기화
                if(copyS.startsWith(subsS)){
                    cnt++;
                    if(copyS.equals(subsS)){
                        resultS.append(cnt).append(copyS);
                    }
                }else{
                    if(cnt>1)
                        resultS.append(cnt);
                    
                    resultS.append(subsS);
                    
                    if(copyS.length()<=i)
                        resultS.append(copyS);
                    cnt = 1;
                }
            }
            answer = Math.min(answer, resultS.length());
        }
        
        return answer;
    }
}