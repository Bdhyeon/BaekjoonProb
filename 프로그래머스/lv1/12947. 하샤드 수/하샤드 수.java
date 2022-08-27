class Solution {
    public boolean solution(int x) {
        int copyX = x;
        int log10 = (int)Math.log10(x)+1;
        int sum = 0;
        
        for(int i=0; i<log10; i++){
            sum += copyX % 10;
            copyX /= 10;
        }
        
        return x % sum == 0;
    }
}