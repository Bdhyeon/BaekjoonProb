import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        
        for(int i=max; ; i += max){
            for(int j=0; j<arr.length-1; j++){
                if(i % arr[j] != 0)
                    break;
                else if(j == arr.length - 2)
                    return i;
            }
        }
        
    }
}