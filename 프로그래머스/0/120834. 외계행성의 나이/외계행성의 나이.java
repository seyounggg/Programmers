class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        sb.append(age); // 숫자를 문자열로 변환하여 sb에 추가

        char[] alpha = new char[sb.length()];

        for(int i = 0; i < sb.length(); i++) {
          char temp = sb.charAt(i);
          // '0'을 빼서 'a'로부터 '?'만큼 멀어진 단어를 얻기
          alpha[i] = (char)('a' + (temp - '0'));
        }
        
        String answer = new String(alpha);
        return answer;
    }
}