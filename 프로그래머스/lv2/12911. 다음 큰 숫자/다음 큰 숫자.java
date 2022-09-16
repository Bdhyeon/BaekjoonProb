class Solution {
    public int solution(int n) {
        int bitCountN = Integer.bitCount(n);
        int x = n + 1;
        
        while(bitCountN != Integer.bitCount(x)){
            x++;
        }
        
        return x;
    }
    
}