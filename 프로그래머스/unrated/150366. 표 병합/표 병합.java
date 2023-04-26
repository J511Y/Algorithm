import java.util.*;

class Solution {
    public int[] parent = new int[2501];
    public String[] data = new String[2501];
    {
        for(int i = 0; i <= 2500; i++) {
            parent[i] = i;
            data[i] = "";
        }
    }
    void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) parent[b] = a;
    }
    
    int find(int a) {
        return parent[a] == a ? a : (parent[a] = find(parent[a]));
    }
    
    int parent(String r, String c) { return find(index(Int(r), Int(c))); }
    
    int Int(String s) { return Integer.parseInt(s); }

    int index(int x, int y) {
        return (x - 1) * 50 + y;
    }
    
    void update(int r, int c, String value) {
        data[find(index(r, c))] = value;
    }
    
    void update(String v1, String v2) {
        for(int i = 0; i <= 2500; i++) {
            if (data[i].equals(v1)) data[i] = v2;
        }
    }

    public String[] solution(String[] commands) {
        String[] answer = new String[2501];
        int n = 0;
        
        for(String c : commands) {
            String[] split = c.split(" ");
            String command = split[0];
            if (command.equals("UPDATE")) {
                if (split.length > 3) update(Int(split[1]), Int(split[2]), split[3]);
                else update(split[1], split[2]);
            }
            if (command.equals("MERGE")) {
                int p1 = parent(split[1], split[2]);
                int p2 = parent(split[3], split[4]);
                if (p1 != p2) {
                    String val = data[p1].isBlank() ? data[p2] : data[p1];
                    data[p1] = val;
                    union(p1, p2);
                }
            }
            if (command.equals("UNMERGE")) {
                int idx = index(Int(split[1]), Int(split[2])), p = parent(split[1], split[2]);
                String val = data[p];
                boolean[] del = new boolean[2501];
                for(int i = 0; i <= 2500; i++) del[i] = find(i) == p;
                for(int i = 0; i <= 2500; i++) {
                    if (del[i]) {
                        parent[i] = i;
                        data[i] = "";
                    }
                }
                data[idx] = val;
            }
            if (command.equals("PRINT")) {
                int p = parent(split[1], split[2]);
                answer[n++] = data[p].isBlank() ? "EMPTY" : data[p];
            }
        }

        return Arrays.copyOfRange(answer, 0, n);
    }

}