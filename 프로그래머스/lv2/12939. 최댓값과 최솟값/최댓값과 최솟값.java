class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        
        for(int i=0; i<nums.length; i++){
            int num = Integer.parseInt(nums[i]);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        
        answer = min + " " + max;
        return answer;
    }
}