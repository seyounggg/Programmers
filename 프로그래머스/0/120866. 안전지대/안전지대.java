import java.util.ArrayList;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        // 지뢰 주변 위치 설정
        int[] bx = {-1,0,1,-1,1,-1,0,1};
        int[] by = {1,1,1,0,0,-1,-1,-1};
        
        // 지뢰 찾기!
        ArrayList<int[]> arrList = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    int[] tmp = {i, j};
                    arrList.add(tmp);
                }
            }
        }
        
        // 위험지역 1로 바꾸기
        for(int i = 0; i < arrList.size(); i++){
            int x = arrList.get(i)[0];
            int y = arrList.get(i)[1];
            for(int j = 0; j < 8; j++){
                if(bx[j]+x >= 0 && by[j]+y >= 0 && bx[j]+x < board.length 
                   && by[j]+y < board.length){
                    board[bx[j]+x][by[j]+y] = 1;
                }
            }
        }
        
        // 안전지대(0) 카운트!
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}