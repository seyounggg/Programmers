class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length]; // 역순 저장할 배열
        
        for(int i = 0; i < length; i++){
            answer[i] = num_list[length-1-i];
        }
        
        return answer;
    }
}