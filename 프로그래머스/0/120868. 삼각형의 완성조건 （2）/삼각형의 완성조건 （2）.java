import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        
        for(int i = b-a+1; i < a+b; i++){
            answer++;
        }
        
        return answer;
    }
}