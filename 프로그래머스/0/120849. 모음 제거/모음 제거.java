class Solution {
    public String solution(String my_string) {
        char[] strings = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strings.length; i++){
            if(strings[i] == 'a' || strings[i] == 'e' || strings[i] == 'i' || strings[i] == 'o' || strings[i] == 'u'){
                sb.append("");
                continue;
            }
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}