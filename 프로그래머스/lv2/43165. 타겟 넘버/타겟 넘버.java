class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
    
    public int dfs(int[] numbers, int sum, int depth, int target){
        int answer = 0;
        
        if(numbers.length == depth){
            if(sum == target)
                return 1;
            return 0;
        }
        
        answer += dfs(numbers, numbers[depth] + sum, depth + 1, target);
        answer += dfs(numbers, (-1) * numbers[depth] + sum, depth + 1, target);
        
        return answer;
    }
    
}