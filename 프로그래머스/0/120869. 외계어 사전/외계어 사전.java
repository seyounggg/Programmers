import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Set<String> hashSet = new HashSet<>();
        
        for(String s : spell){
            hashSet.add(s);
        }
        
        for(String word : dic){
            int count = 0;
            for(String s : hashSet){
                if(word.contains(s)) count++;
            }
            if(count == hashSet.size()){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}