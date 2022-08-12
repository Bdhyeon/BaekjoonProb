class Solution {
    boolean solution(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int chk = 0;
        
        for(char c : arr){
            if(c == 'p')
                chk++;
            else if(c == 'y')
                chk--;
        }

        return chk == 0;
    }
}