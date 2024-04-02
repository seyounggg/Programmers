class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
    int tmp1 = denom1 * denom2; // 공통분모 구하기
    int tmp2 = numer1 * denom2; 
    int tmp3 = numer2 * denom1;
    int tmp4 = tmp2 + tmp3; // 분자의 합

    int c = method1(tmp4, tmp1);

    int[] answer = {tmp4 / c, tmp1 / c};
    return answer;
  }

  // 유클리드 호제법(최대공약수)
  public int method1(int a, int b){
      while(b != 0){
          int tmp = b;
          b = a % b;
          a = tmp;
      }
      return a;
  }
}
