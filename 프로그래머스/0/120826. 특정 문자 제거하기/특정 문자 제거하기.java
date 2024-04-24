class Solution {
    public String solution(String my_string, String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp != letter.charAt(0)){
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}