class Solution {
    public long solution(long price, long money, long count) {
        long count_sum = (count * (count + 1)) / 2;
        price = price * count_sum;
        long result = price - money;

        if(price > money){
            return result;
        }else {
            return 0;
        }
    }
}