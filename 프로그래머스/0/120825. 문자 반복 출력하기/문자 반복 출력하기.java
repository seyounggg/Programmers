class Solution {
    public String solution(String my_string, int n) {
        char[] strings = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : strings){
            for(int i=0; i<n; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}