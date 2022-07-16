class Solution {
    public boolean solution(int x) {
        int num = 0;
        int a = x;
        while(a > 0){
            num += a % 10;
            a /= 10;
        }
        if(x % num == 0)
            return true;
        else
            return false;
    }
}