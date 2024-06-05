class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" [+] ");
        int xSum = 0;
        int intSum = 0;
        
        for(String s : arr){
            s = s.trim();
            if(s.contains("x")){
                if(s.equals("x")){
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(s.replace("x",""));
                }
            } else {
                intSum += Integer.parseInt(s);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(xSum > 0)
            if(xSum == 1){
                sb.append("x");
            } else {
             sb.append(xSum).append("x");   
            }
        if(intSum > 0){
            if(xSum > 0) sb.append(" + ");
            sb.append(intSum);
        }
        
        return sb.toString();
    }
}