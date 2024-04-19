class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray(); // 문자열을 배열로 변환
        char[] temp = new char[c.length];
        
        for(int i=0;i<c.length;i++){
            temp[i] = c[c.length - 1 - i];
        }
        
        return new String(temp);
    }
}