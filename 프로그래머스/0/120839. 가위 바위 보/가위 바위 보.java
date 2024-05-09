class Solution {
  public String solution(String rsp) {
    char[] temp = rsp.toCharArray();
    char[] c = new char[temp.length];

    for(int i = 0; i < temp.length; i++){
      if(temp[i] == '2'){
        c[i] = '0';
      } else if(temp[i] == '0'){
        c[i] = '5';
      } else if(temp[i] == '5'){
        c[i] = '2';
      }
    }
    return new String(c);
  }
}