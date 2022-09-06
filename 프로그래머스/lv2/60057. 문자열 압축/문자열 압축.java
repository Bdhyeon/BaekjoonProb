class Solution {
    public int solution(String s) {
        int length = s.length();
        int answer = length;
        
        for(int i=1; i<=length/2; i++){
            String copyS = s;
            String resultS = "";
            int cnt = 1; //반복되는 횟수 카운트
            
            while(copyS.length()>i){
                String subsS = copyS.substring(0, i);
                copyS = copyS.substring(i);
                //System.out.println("i=" + i + " s=" + subsS + " c=" + copyS);
                
                //압축되는 문자열이 있을 경우 반복횟수+1, 없을경우 횟수 초기화
                if(copyS.startsWith(subsS)){
                    cnt++;
                    if(copyS.equals(subsS)){
                        resultS += cnt;
                        resultS += copyS;
                    }
                }else{
                    if(cnt>1)
                        resultS += cnt;
                    resultS = copyS.length()>i ? resultS + subsS : resultS + subsS + copyS;
                    cnt = 1;
                }
            }
            answer = Math.min(answer, resultS.length());
            //System.out.println("i=" + i + " test=" + resultS + " 길이=" + resultS.length());
        }
        
        return answer;
    }
}