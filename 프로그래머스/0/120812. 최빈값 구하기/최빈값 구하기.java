class Solution {
    public int solution(int[] array) {
        // 각 수의 카운트를 담을 배열을 선언
        int[] count = new int[array.length];
        
        // 두 수를 비교하여 빈도 찾기
        for(int i=0;i<array.length;i++){
          for(int j=i+1;j<array.length;j++){
            if(array[i] == array[j]){
              count[i]++;
            }
          }
        }
        
        // count에서 가장 큰 수 인덱스 찾기
        int tmp = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] > count[tmp]){
                tmp = i;
            }
        }
        
        // 최빈값이 여러개일 경우
        for(int i=0;i<count.length;i++){
            // 1.최빈값의 인덱스와 현재 인덱스가 같지 않아야 하고,
            // 2. 현재등장횟수가 최빈값의 등장횟수와 같은지 확인
            if(i != tmp && count[i] == count[tmp]){
                return -1;
            }
        }
        
        return array[tmp];
    }
}