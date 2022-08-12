import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        int[] answer = list.size() != 0 ? list.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
        Arrays.sort(answer);
        
        return answer;
    }
}