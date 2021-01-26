package baekjoon_트라이;
// https://www.acmicpc.net/problem/5670
// 휴대폰 자판
/*
 * 문제 풀기 전 생각 2020.05.04 20:00
 * ----------------------------
 * 오랜만에 트라이 도전
 */
import java.io.*;
import java.util.*;
class Trie{
	List<Trie> list = new ArrayList<Trie>();
	int size = 0, finish = 0;
	char c;
	Trie(){}
	Trie(char c){
		this.c = c;
	}
	int find(char c) {
		for(int i = 0; i < size; i++) {
			if(list.get(i).c == c) return i;
		}
		return -1;
	}
	void add(char[] c, int idx) {
		if(idx == c.length) {
			this.finish = 1;
			return;
		}
		int find = find(c[idx]);
		if(find == -1) {
			list.add(new Trie(c[idx]));
			this.size++;
			find = size - 1;
		}
		list.get(find).add(c, idx + 1);
	}
	int search(String s, int idx, int len, int fin) {
		if(idx == len) return 0;
		Trie trie = list.get(find(s.charAt(idx)));
		int i = 0;
		if(fin == 1) i = 1;
		else if(size > 1) i = 1;
		return i + trie.search(s, idx + 1, len, trie.finish);
	}
}
public class baekjoon_5670 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			Trie root = new Trie();
			int n;
			try{
				n = Integer.parseInt(br.readLine());
			}catch(Exception e) {
				System.out.println(sb);
				return;
			}
			String[] input = new String[n];
			for(int i = 0; i < n; i++) {
				String s = br.readLine();
				input[i] = s;
				root.add(s.toCharArray(), 0);
			}
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += root.search(input[i], 0, input[i].length(), 1);
			}
			sb.append(String.format("%.2f\n", (double)sum / n));
		}
	}
}
