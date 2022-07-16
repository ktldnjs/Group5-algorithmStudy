class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        final String REGEX = "[0-9]+";

        int cnt = 0;
        if(s.matches(REGEX)) {
            for(int i = 0; i < s.toCharArray().length; i++){
                cnt++;
            }
        }else{
            answer = false;
        }answer = (cnt == 4 || cnt == 6) ? true : false;

        return answer;
    }
}