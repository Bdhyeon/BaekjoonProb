import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] per = new double[N][4];
        
        // {성공한 사람, 실패한 사람, 실패율, 스테이지 단계}
        for(double data : stages){
            for(int i=0; i<Math.min(data, N); i++){
                per[i][0]++;
                if(i == data - 1)
                    per[i][1]++;
            }
        }
        
        for(int i=0; i<per.length; i++){
            double fail = per[i][1] / per[i][0];
            per[i][2] = Double.isNaN(fail) ? 0 : fail;
            per[i][3] = i + 1;
        }
        
        Arrays.sort(per, (a, b) -> Double.compare(b[2], a[2]));
        
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)per[i][3];
        }
        
        return answer;
    }
}