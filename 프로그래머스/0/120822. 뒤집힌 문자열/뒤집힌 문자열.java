class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] num_Array = my_string.toCharArray();
        
        for (int i = my_string.length()-1; i >= 0; i--) {
            answer += num_Array[i];
        }
        
        return answer;
    }
}