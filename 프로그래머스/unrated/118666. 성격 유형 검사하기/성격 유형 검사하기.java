class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String chara = "RCJATFMN";
        int[] score = new int[chara.length()];
        
        for(int j=0; j<survey.length; j++){
            if(choices[j] < 4){
                score[chara.indexOf(survey[j].charAt(0))] += Math.abs(choices[j]-4);
            }else if(choices[j] > 4){
                score[chara.indexOf(survey[j].charAt(1))] += Math.abs(choices[j]-4);
            }
        }
        
        for(int i=0; i<score.length / 2; i++){
            if(score[i] > score[i+4]){
                answer.append(chara.charAt(i));
            }else if(score[i] < score[i+4]){
                answer.append(chara.charAt(i + 4));
            }else{
                answer.append(chara.charAt(i) < chara.charAt(i+4) ? chara.charAt(i) : chara.charAt(i+4));
            }
        }
        
        return answer.toString();
    }
}