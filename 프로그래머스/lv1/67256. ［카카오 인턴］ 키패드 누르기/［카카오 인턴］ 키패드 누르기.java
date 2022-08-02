class Solution {
    public String solution(int[] numbers, String hand) {
        int[][] phone = {{4, 2},{1, 1},{1, 2},{1, 3},{2, 1},{2, 2},{2, 3},{3, 1},{3, 2},{3, 3},{4, 1},{4, 3}};
        StringBuilder sb = new StringBuilder();
        
        int left = 10;
        int right = 11;
        
        for(int data : numbers){
            switch(data){
                case 1: case 4: case 7: sb.append("L"); left = data; break;
                case 3: case 6: case 9: sb.append("R"); right = data; break;
                default:
                    if(chk(phone, data, left) > chk(phone, data, right)){
                        sb.append("R"); right = data;
                    }else if(chk(phone, data, left) < chk(phone, data, right)){
                        sb.append("L"); left = data;
                    }else{
                        if(hand.equals("left")){
                            sb.append("L"); left = data;
                        }else{
                            sb.append("R"); right = data;
                        }
                    }
            }
        }
        return sb.toString();
    }//end solution()
        
    public int chk(int[][] phone, int data, int hand){
        
        return Math.abs(phone[data][0] - phone[hand][0]) + Math.abs(phone[data][1] - phone[hand][1]);
    }//end chk()
}