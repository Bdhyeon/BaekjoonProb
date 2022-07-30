class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(isPrime(answer));
        
        for(int a=0; a<nums.length-2; a++){
            for(int b=a+1; b<nums.length-1; b++){
                for(int c=b+1; c<nums.length; c++){
                    answer = isPrime(nums[a]+nums[b]+nums[c]) ? answer + 1 : answer;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num) ;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}