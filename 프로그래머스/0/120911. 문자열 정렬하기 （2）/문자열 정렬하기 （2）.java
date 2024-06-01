import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] tmp = my_string.toCharArray();
        Arrays.sort(tmp);
        
        StringBuilder sb = new StringBuilder();
        for(char c : tmp){
            sb.append(c);
        }
        
        return sb.toString();
    }
}