import java.util.*;
class Solution {
    int n, INF = 1 << 28;
    int[] gates, vst, parent;
    List<List<int[]>> dist;
    
    int[] dijkstra(int[] summits) {
        Arrays.fill(vst, INF);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] - b[1] != 0) return a[1] - b[1];
            return parent[a[0]] - parent[b[0]];
        });
        for(int s : summits) {
            pq.add(new int[] { s, 0 });
            vst[s] = 0;
            parent[s] = s;
        }
        while(!pq.isEmpty()) {
            int[] p = pq.poll();
            int s = p[0], d = p[1];
            for(int[] arr : dist.get(s)) {
                int e = arr[0], max = Math.max(d, arr[1]);
                if (vst[e] > max || (vst[e] == max && parent[e] > parent[s])) {
                    pq.add(new int[] { e, max });
                    vst[e] = max;
                    parent[e] = parent[s];
                }
            }
        }
        int[] answer = { 0, INF };
        for(int g : gates) {
            int v = vst[g];
            if (answer[1] == v) answer[0] = Math.min(answer[0], parent[g]);
            if (answer[1] > v) answer = new int[] { parent[g], v };
        }
        return answer;
    }
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int[] answer = { 0, INF };
        // 길 인접리스트, 거리 인접행렬 초기화
        this.n = n;
        this.gates = gates;
        this.vst = new int[n + 1];
        this.parent = new int[n + 1];
        dist = new ArrayList<>();
        for(int i = 0; i <= n; i++) dist.add(new ArrayList<int[]>());
        for(int[] path : paths) {
            int a = path[0], b = path[1], d = path[2];
            dist.get(a).add(new int[] { b, d });
            dist.get(b).add(new int[] { a, d });
        }
        
        // 모든 summit에 대해 각 게이트로 도착하는 다익스트라 시행
        Arrays.sort(summits);
        return dijkstra(summits);
    }
}