import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char c : my_string.toCharArray()){
            set.add(c);
        }
        
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            answer += iterator.next();
        }
        return answer;
    }
}