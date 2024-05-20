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
        
        Iterator<Integer> iterator = hashSet.iterator();
        int[] answer = new int[hashSet.size()];
        int i = 0;
        while(iterator.hasNext()){
            answer[i] = iterator.next();
            i++;
        }
        
        answer = Arrays.stream(answer).sorted().toArray();
        return answer;
    }
}