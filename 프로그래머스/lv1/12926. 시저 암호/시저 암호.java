class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : arr){
            if(c >= 97)
                c = (char)((c - 'a' + n) % 26 + 97);
            else if(c>=65)
                c = (char)((c - 'A' + n) % 26 + 65);
            sb.append(c);
        }
        
        return sb.toString();
    }
}