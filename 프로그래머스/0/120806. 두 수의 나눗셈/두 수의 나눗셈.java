class Solution {
    public int solution(int num1, int num2) {
        double temp1 = (double)num1 / num2;
        double temp2 = temp1 * 1000;
        int answer = (int)temp2;
        return answer;
    }
}