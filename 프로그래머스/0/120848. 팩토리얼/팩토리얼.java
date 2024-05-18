class Solution {
    public int solution(int n) {
        int answer = 1;
        int j = 1;
        while(true){
            j = j*answer;
            if(j == n){
                break;
            } else if(j > n) {
                answer--;
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}