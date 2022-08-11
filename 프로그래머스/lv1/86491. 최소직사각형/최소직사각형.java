import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] max = new int[2];
        
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            max[0] = max[0] > sizes[i][0] ? max[0] : sizes[i][0];
            for(int j=0; j<sizes[i].length; j++){
                max[1] = max[1] > sizes[i][1] ? max[1] : sizes[i][1];
            }
        }
        
        return max[0] * max[1];
    }
}