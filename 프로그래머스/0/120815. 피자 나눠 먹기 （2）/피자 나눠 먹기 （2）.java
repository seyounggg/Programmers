class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 6 == 0){
            answer = n / 6;
        } else {
            int i = 1;
            while(true){
                int j = n * i;
                if(j % 6 == 0){
                    answer = j / 6;
                    break;
                }
                i++;
            }
        }
        return answer;
    }
}