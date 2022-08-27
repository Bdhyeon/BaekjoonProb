class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int[] scores = new int[3];
        
        for(int i=0; i<3; i++){
        	int score = 0;
        	// 숫자부분 처리
        	if(dartResult.substring(0, 2).equals("10")) {
        		score = 10;
        		dartResult = dartResult.replaceFirst("10", "");
        	}else {
        		score = Integer.parseInt(dartResult.substring(0, 1));
        		dartResult = dartResult.replaceFirst(dartResult.substring(0, 1), "");
        	}
            
        	// 기호부분 처리
        	while(dartResult.length() > 0 && (dartResult.charAt(0) < 48 || dartResult.charAt(0) > 57)) {
        		String c = String.valueOf(dartResult.charAt(0));
                if(c.equals("*")){
                    if(i != 0)
        				scores[i-1] *= 2;
        			score *= 2;
                    dartResult = dartResult.replaceFirst("\\*", "");
                }else{
                    switch(c) {
                    case "D" : score = (int)Math.pow(score, 2); break;
                    case "T" : score = (int)Math.pow(score, 3); break;
                    case "#" : score *= -1; break;
                    }
                    dartResult = dartResult.replaceFirst(c, "");
                }
        	}
        	
        	// 점수 저장
        	scores[i] = score;
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}