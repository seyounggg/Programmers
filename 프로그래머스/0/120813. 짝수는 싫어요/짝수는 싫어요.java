class Solution {
    public int[] solution(int n) {
        int s=(n+1)/2;
        int[] answer = new int[s];
        
        int m = 1; // 홀수의 시작점!
        for(int i=0;i<s;i++){
            answer[i] = m;
            m += 2;
        }
        return answer;
    }
}