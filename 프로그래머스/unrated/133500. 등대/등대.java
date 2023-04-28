import java.util.*;
class Node {
    int n, level;
    List<Integer> childs = new ArrayList<>();
    public Node(int n, int level) {
        this.n = n;
        this.level = level;
    }
    void addChild(int c) {
        this.childs.add(c);
    }
}
class Solution {
    public int solution(int n, int[][] lighthouse) {
        int[] parent = new int[n + 1];
        boolean[] light = new boolean[n + 1];
        Node[] nodes = new Node[n + 1];
        parent[1] = 1;
        // 뱃길, 노드 초기화
        List<List<Integer>> routes = new ArrayList<>();
        for(int i = 0; i <= n; i++) routes.add(new ArrayList<>());
        for(int[] house : lighthouse) {
            int a = house[0], b = house[1];
            routes.get(a).add(b);
            routes.get(b).add(a);
        }
        
        // 부모, 노드 설정
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        nodes[1] = new Node(1, 0);
        while(!q.isEmpty()) {
            int p = q.poll();
            for(int i : routes.get(p)) {
                if (parent[i] == 0) {
                    nodes[p].addChild(i);
                    nodes[i] = new Node(i, nodes[p].level + 1);
                    parent[i] = p;
                    q.add(i);
                }
            }
        }
        
        // 불켜기
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> b.level - a.level);
        for(int i = 1; i <= n; i++) pq.add(nodes[i]);
        int answer = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            boolean hasChild = node.childs.size() > 0, anyOn = false;
            for(int i : node.childs) anyOn |= !light[i];
            if (hasChild && anyOn) light[node.n] = true;
        }
        for(boolean b : light) answer += b ? 1 : 0;
        return answer;
    }
}