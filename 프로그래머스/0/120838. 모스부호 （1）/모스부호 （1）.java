class Solution {
    public String solution(String letter) {
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] s = letter.split(" ");
        char[] answer = new char[s.length];

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < m.length; j++){
                if(m[j].equals(s[i])){
                    answer[i] = (char)('a'+j);
                    break;
                }
            }
        }
        return new String(answer);
    }
}