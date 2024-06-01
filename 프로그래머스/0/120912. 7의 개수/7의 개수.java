class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array){
            String tmp = String.valueOf(i);
            for(char c : tmp.toCharArray()){
                if(c == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}