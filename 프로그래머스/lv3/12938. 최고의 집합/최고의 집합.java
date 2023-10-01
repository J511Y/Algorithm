class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {-1};
        int mok = s / n, nmg = s % n;
        if(mok == 0) return answer;
        answer = new int[n];
        for(int i = 0; i < n; i++, nmg--) answer[n - i - 1] = mok + (nmg > 0 ? 1 : 0);
        return answer;
    }
}