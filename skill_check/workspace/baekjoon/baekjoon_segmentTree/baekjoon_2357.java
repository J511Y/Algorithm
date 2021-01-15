package baekjoon_segmentTree;
import java.util.*;
import java.io.*;
class baekjoon_2357 {
	static BufferedReader br;
	static BufferedWriter bw;
	static Node[] seg;
	static int n, m, level, len, a, b, start;
	public static void main(String[] ar) throws Exception{
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		level = level(n);
		len = 1 << level;
		seg = new Node[1000001];
		for(int i = 0; i < seg.length; i++) seg[i] = new Node();
		start = 1 << (level - 1);
		for(int i = start; i < seg.length; i++){
			if(i >= start + n) {
				seg[i].max = Integer.MIN_VALUE;
				seg[i].min = Integer.MAX_VALUE;
			}else {
				seg[i] = new Node(Integer.parseInt(br.readLine()));				
			}
		}
		init();
		for(int i = 0; i < m; i++){
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			Node node = find(a, b, 1, 1, len / 2);
			bw.write(node.min + " " + node.max + "\n");
		}
		bw.flush();
	}
	
	static int level(int a){
		if(a == 0) return 1;
		return 1 + level(a / 2);
	}
	
	static void init(){
		int i = ((len + 1) / 4);
		while(i > 0){
			for(int x = i; x < i * 2; x++){
				seg[x].min = Math.min(seg[x * 2].min, seg[x * 2 + 1].min);
				seg[x].max = Math.max(seg[x * 2].max, seg[x * 2 + 1].max);
			}
			i /= 2;
		}
	}
	
	static Node find(int a, int b, int idx, int s, int e){
		int half = (s + e) / 2;
		Node node = new Node();
		if(a <= s && e <= b) return seg[idx];
		else if(a <= half){
			Node funcnode = find(a, b, idx * 2, s, half);
			node.min = funcnode.min;
			node.max = funcnode.max;
			if(b > half) {
				Node other = find(a, b, idx * 2 + 1, half + 1, e);
				node.min = Math.min(node.min, other.min);
				node.max = Math.max(node.max, other.max);
			}
		}else if(half <= a){
			Node funcnode = find(a, b, idx * 2 + 1, half + 1, e);
			node.min = funcnode.min;
			node.max = funcnode.max;
			if(b < half) {
				Node other = find(a, b, idx * 2, s, half);
				node.min = Math.min(node.min, other.min);
				node.max = Math.max(node.max, other.max);
			}
		}
		return node;
	}
}

class Node{
	int min;
	int max;
	Node(){}
	Node(int val){
		this.min = val;
		this.max = val;
	}
}