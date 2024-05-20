import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> hashSet = new HashSet<>();
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                n /= i;
                hashSet.add(i);
            }
        }
        
        return hashSet.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}