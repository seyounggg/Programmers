import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0]; //임의의 인접한 수 지정
        Arrays.sort(array);
        
        for(int i : array){
            if(Math.abs(n - i) < Math.abs(n - answer)){
                answer = i;
            } else if(Math.abs(n - i) == Math.abs(n - answer)){
                answer = (answer < i ? answer : i);
            }
        }
        return answer;
    }
}