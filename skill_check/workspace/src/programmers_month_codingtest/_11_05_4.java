package programmers_month_codingtest;

import java.util.*;
public class _11_05_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> graph = new ArrayList<>();
    int max = 0, func_cnt = 1;
    public int solution(int[][] t) {
        for(int i = 0; i < t.length + 1; i++) graph.add(new ArrayList<>());
        for(int[] a : t){
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }

        int s = 0, e = 0;
        for(int i = 0; i < 2; i++){
            boolean[] vst = new boolean[t.length + 1];
            int start = i == 0 ? 0 : s;
            vst[start] = true;
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while(!q.isEmpty()){
                int a = q.poll();
                if(i == 0) s = a;
                else e = a;
                for(int n : graph.get(a)){
                    if(vst[n] == false){
                        vst[n] = true;
                        q.add(n);
                    }
                }
            }
        }
        // s와 e를 루트노드로 하는 새로운 트리 생성
        for(int se = 0; se < 2; se++){
            int x = se == 0 ? s : e;
            Tree tree = new Tree(x);
            boolean[] vst = new boolean[t.length + 1];
            vst[x] = true;
            Queue<Tree> q = new LinkedList<>();
            q.add(tree);
            while(!q.isEmpty()){
                Tree tr = q.poll();
                for(int i : graph.get(tr.index)){
                    if(vst[i] == false){
                        vst[i] = true;
                        int idx = tr.add(i);
                        q.add(tr.get(idx));
                    }
                }
            }
            max = Math.max(max, tree.count() + 1);
        }
        return max;
    }
}

class Tree{
    int index, size = 0;
    List<Tree> child = new ArrayList<>();
    Tree(int index){
        this.index = index;
    }
    int add(int i){
        child.add(new Tree(i));
        return size++;
    }

    Tree get(int i){
        return child.get(i);
    }

    int count(){
        int sum = Math.min(2, size);
        List<Integer> list = new ArrayList<>();
        for(Tree t : child) list.add(t.count());
        list.sort((a, b)->{return b - a;});
        for(int i = 0; i < Math.min(2, list.size()); i++) sum += list.get(i);
        return sum;
    }
}