import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        
        for(int i = 1; i > 0; i++){
            if(i % 3 == 0) continue;
            String tmp = Integer.toString(i);
            if(tmp.contains("3")) continue;
            numList.add(i);
            count++;
            if(count == 100) break;
        }
        
        return numList.get(n-1);
    }
}