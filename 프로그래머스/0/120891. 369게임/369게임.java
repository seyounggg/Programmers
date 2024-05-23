import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
        int[] array = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i : array){
            if(i == 3 || i == 6 || i ==9){
                answer++;
            }
        }
        return answer; 
    }
}