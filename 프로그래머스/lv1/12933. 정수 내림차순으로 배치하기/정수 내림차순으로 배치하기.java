import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(char data : arr){
            sb.append(data);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}