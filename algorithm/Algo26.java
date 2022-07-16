import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        // 배열의 크기가 1인 경우 먼저 확인
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        // arr보다 크기가 1작은 배열 생성
        int[] answer = new int[arr.length-1];

        // 가장작은수를 아무거나 지정, index 0 은 항상존재 하니까 0으로 지정
        int min_num = arr[0];

        // Math.min(a, b) -> a와 b중 작은 수 출력
        for(int i=0; i<arr.length; i++){
            min_num = Math.min(min_num , arr[i]);
        }

        // 0인 변수를 지정안해주니까 answer배열에
        // 어떻게 넣어야 할지 몰라서 임의로 변수 하나 0으로 지정

        int col = 0; // 인덱스 넘버라고 생각

        for(int j=0; j<arr.length; j++){

            // arr[j]가 가장 작은수라면 넘어가고 for문으로 돌아간다.
            if(arr[j] == min_num){
                continue;
            }
            answer[col++] = arr[j];
        }

        return answer;
    }
}