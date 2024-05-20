import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        int j = 0;
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                list.add(Character.getNumericValue(c));
                answer += list.get(j);
                j++;
            }
        }
        
        return answer;
    }
}