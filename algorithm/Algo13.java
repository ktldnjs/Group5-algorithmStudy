class Solution {
    public String solution(int a, int b) {

        // a : 월, b: 일

        // 2016년 1월 1일은 금요일이기 때문에 FRI로 시작했었는데
        //String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        // 달마다 일수
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 0부터 11까지 -> 1월부터 12월까지
        for(int i=0; i<a-1; i++){
            b += month[i];
        }

        // 1월 1일일 경우 a = 1, b = 1 -> 1%7 = 1
        return week[b%7];
    }
}