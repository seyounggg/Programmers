class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numString = Integer.toString(num);
        int[] arr = new int[numString.length()];
        
        // 1. int배열로 변경
        for(int i = 0; i < numString.length(); i++){
            arr[i] = numString.charAt(i) - '0';
        }
        
        // 2. k값의 인덱스 번호 찾기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) {
                answer += i+2;
                break;
            }
        }
        
        return answer;
    }
}