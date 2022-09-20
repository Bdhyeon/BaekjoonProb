class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        double smaller = Math.min(a, b);
        double bigger = Math.max(a, b);
        
        while(!(bigger - smaller == 1 && smaller % 2 == 1)){
            answer++;
            smaller = Math.round(smaller/2);
            bigger = Math.round(bigger/2);
        }

        return answer;
    }
}