import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; sb.length() < t * (m + 1); i++) sb.append(Integer.toString(i, n));
        String answer = "", tmp = sb.toString().toUpperCase();
        for(int i = 0; i < t; i++) {
            int idx = (p - 1) + m * i;
            answer += tmp.charAt(idx);
        }
        return answer;
    }
}
