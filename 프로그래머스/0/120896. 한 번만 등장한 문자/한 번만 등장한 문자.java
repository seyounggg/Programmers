import java.util.*;

class Solution {
    public String solution(String s) {
        
        Map<Character, Integer> countMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }
        
        for(char c : s.toCharArray()){
            if(countMap.get(c) == 1){
                sb.append(c);
            }
        }
        
        char[] answer = sb.toString().toCharArray();
        Arrays.sort(answer);
        
        return String.valueOf(answer);
    }
}