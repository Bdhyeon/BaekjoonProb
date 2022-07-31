class Solution {
    public int solution(int[] numbers) {
        
        int sum = 0;
        
        for(int data : numbers){
            sum += data;
        }
        
        return 45 - sum;
    }
}