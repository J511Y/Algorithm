class Solution {
    int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
    public boolean isOK(char a, char b, char c) {
        return ((a == 'P' && b == 'O' && c == 'P') | (a == 'P' && b == 'P') | (b == 'P' && c == 'P')) ? false : true;
    }
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int k = 0; k < 5; k++) {
            boolean ok = true;
            var place = places[k];
            // 종횡
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 3; j++) {
                    ok &= (isOK(place[i].charAt(j), place[i].charAt(j + 1), place[i].charAt(j + 2)));
                    ok &= (isOK(place[j].charAt(i), place[j + 1].charAt(i), place[j + 2].charAt(i)));
                }
            }
            // 우하강 대각선
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    ok &= (isOK(place[i].charAt(j), place[i].charAt(j + 1), place[i + 1].charAt(j + 1)));
                    ok &= (isOK(place[i].charAt(j), place[i + 1].charAt(j), place[i + 1].charAt(j + 1)));
                }
            }
            // 좌하강 대각선
            for(int i = 0; i < 4; i++) {
                for(int j = 4; j > 0; j--) {
                    ok &= (isOK(place[i].charAt(j), place[i].charAt(j - 1), place[i + 1].charAt(j - 1)));
                    ok &= (isOK(place[i].charAt(j), place[i + 1].charAt(j), place[i + 1].charAt(j - 1)));
                }
            }
            answer[k] = ok ? 1 : 0;
        }
        return answer;
    }
}