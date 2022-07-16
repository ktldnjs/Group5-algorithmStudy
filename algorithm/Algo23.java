class Solution {
    public int[] solution(long n) {

        int num = Long.toString(n).length();

        // 배열 생성
        // 변수이름 = new 타입[길이];
        int[] answer = new int[num];

        for(int i = 0; i<num; i++){
            answer[i] = (int)(n%10);
            n /= 10;
        }

        return answer;
    }
}