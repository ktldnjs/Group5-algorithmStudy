class Solution {
    public double solution(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

        //answer = sum / arr.length;
        //double answer = sum / arr.length;
        float answer = (float) sum/arr.length;

        return answer;
    }
}