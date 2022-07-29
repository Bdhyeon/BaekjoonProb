import java.util.*;

class Solution {
    public static int solution(int[][] board, int[] moves) {
        List<Integer> crain = new ArrayList<Integer>();
        int answer = 0;
        
        for(int i=0; i<moves.length; i++){
            int row = -1;
            for(int j=0; j<board[0].length; j++){
                if(moves[i] == j + 1){
                    do {
                    	row++;
                    }while(board[row][j]==0 && row<board[0].length-1);
                    
                    if(crain.size() == 0 || crain.get(crain.size()-1) != board[row][j]) {
                    	crain.add(board[row][j]);
                    }else if(crain.get(crain.size()-1) != 0){
                    	answer += 2;
                    	crain.remove(crain.size()-1);
                    }else {
                    	crain.remove(crain.size()-1);
                    }
                    board[row][j] = 0;
                }
            }
        }
        
        return answer;
    }
    
}