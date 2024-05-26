class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] array = my_string.toCharArray();
        char temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        
        return new String(array);
    }
}