import java.util.*;
class Solution {
    static int net = 0;
    static int[] vst;
    void DFS(int x, int[][] map){
        vst[x] = 1;
        for(int i = 0; i < map.length; i++){
            if(map[x][i] == 1 && vst[i] != 1) {
                DFS(i, map);
            }
        }
    }
    public int solution(int n, int[][] map) {
        vst = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1 && vst[i] != 1) {
                    net++;
                    DFS(i, map);
                }
            }
        }
        return net;
    }
}