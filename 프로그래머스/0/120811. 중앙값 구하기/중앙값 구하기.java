import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 배열의 개수가 홀수일 경우
        if(arr.length % 2 == 1){
          answer = arr[arr.length / 2];
        }
        else{ // 배열의 개수가 짝수일 경우
          int tmp1 = arr[arr.length / 2 - 1];
          int tmp2 = arr[arr.length / 2];
          answer = (int)((tmp1+tmp2) / 2);
        }
        return answer;
    }
}