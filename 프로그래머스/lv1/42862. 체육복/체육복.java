import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -9;
                    reserve[j] = -99;
                    break;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1){
                    lost[i] = -9;
                    reserve[j] = -99;
                    break;
                }else if(j == reserve.length - 1 && lost[i] != -9){
                    n--;
                }
            }
        }
        
        
        return n;
    }
}