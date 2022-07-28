class Solution {
    public int[] solution(int[] answers) {
        int[] a1 = new int[answers.length];
        int chk1 = 0;
        int chk2 = 0;
        int chk3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == (i%5)+1)
                chk1++;
            
            if(answers[i] == 2 & i%2 == 0)
                chk2++;
            if(i%2 != 0){
                switch(i%8){
                    case 1: chk2 = answers[i] == 1 ? chk2 + 1 : chk2; break;
                    case 3: chk2 = answers[i] == 3 ? chk2 + 1 : chk2; break;
                    case 5: chk2 = answers[i] == 4 ? chk2 + 1 : chk2; break;
                    case 7: chk2 = answers[i] == 5 ? chk2 + 1 : chk2; break;
                }
            }
            
            switch(i%10){
                case 0: case 1: chk3 = answers[i] == 3 ? chk3 + 1 : chk3; break;
                case 2: case 3: chk3 = answers[i] == 1 ? chk3 + 1 : chk3; break;
                case 4: case 5: chk3 = answers[i] == 2 ? chk3 + 1 : chk3; break;
                case 6: case 7: chk3 = answers[i] == 4 ? chk3 + 1 : chk3; break;
                case 8: case 9: chk3 = answers[i] == 5 ? chk3 + 1 : chk3; break;
            }
        }
        
        int max = Math.max(chk1, Math.max(chk2, chk3));
        
        
        if(max*3 == chk1 + chk2 + chk3){
            int[] answer = {1, 2, 3};
            return answer;
        }
        
        if(max * 2 == chk1 + chk2){
            int[] answer = {1, 2}; return answer;
        }else if(max * 2 == chk1 + chk3){
            int[] answer = {1, 3}; return answer;
        }else if(max * 2 == chk2 + chk3){
            int[] answer = {2, 3}; return answer;
        }
        
        if(max==chk1){
            int[] answer = {1}; return answer;
        }else if(max==chk2){
            int[] answer = {2}; return answer;
        }else{
            int[] answer = {3}; return answer;
        }
    }
}