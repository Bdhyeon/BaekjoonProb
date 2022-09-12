class Solution {
    public int cnt = 0;
    public int zero = 0;
    
    public int[] solution(String s) {
        change(s);
        int[] answer = {cnt, zero};
        return answer;
    }
    
    public void change(String s){
        if(!s.equals("1")){
            cnt++;
            while(s.contains("0")){
                s = s.replaceFirst("0", "");
                zero++;
            }
            change(toDigit(s.length()));
        }
    }
    
    public String toDigit(int num){
        StringBuilder result = new StringBuilder();
        while(num > 0){
            result.insert(0, num%2);
            num /= 2;
        }
        return result.toString();
    }
}