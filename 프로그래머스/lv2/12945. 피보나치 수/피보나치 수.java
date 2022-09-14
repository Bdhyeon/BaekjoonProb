class Solution {
    public int solution(int n) {
        int answer = 0;
        long n1 = 0;
        long n2 = 1;
        long temp = 0;
        
        for(int i=2; i<=n; i++){
            temp = (n1 % 1234567) + (n2 % 1234567);
            n1 = n2;
            n2 = temp;
        }
        
        System.out.println(temp);
        answer = (int)(temp % 1234567);
        
        return answer;
    }
}