class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long priceL = (long)price;
        long moneyL = (long)money;
        
        for(long i=1; i<=count; i++){
            moneyL -= priceL * i;
        }

        return (long)(Math.min(moneyL, 0) * -1);
    }
}