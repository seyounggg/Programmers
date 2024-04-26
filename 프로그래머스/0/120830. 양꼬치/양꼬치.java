class Solution {
    public int solution(int n, int k) {
        int total = (12000 * n) + (2000 * k);
        if(n / 10 > 0){
            return total - (n / 10)*2000;
        } else {
            return total;
        }
    }
}