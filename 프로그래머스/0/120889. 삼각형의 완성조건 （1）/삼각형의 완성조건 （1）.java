import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        
        sides = Arrays.stream(sides).sorted().toArray();
        
        if(sides[0] + sides[1] > sides[2]){
            return 1;
        } else {
            return 2;
        }
    }
}