class Solution {
    public String solution(String rsp) {
        String[] temp = rsp.split("");
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals("0")){
                sb.append("5");
            } else if(temp[i].equals("2")){
                sb.append("0");
            } else
                sb.append("2");
        }
        return sb.toString();
    }
}