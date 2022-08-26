class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int min = 9999999;
        
        for(int data : arr){
            min = data > min ? min : data; 
        }
        
        int chk = 0;
        for(int i=0; i<answer.length; i++){
            if(arr[chk] != min){
                answer[i] = arr[chk];
            }else{
                i--;
            }
            chk++;
        }
        
        return answer;
    }
}