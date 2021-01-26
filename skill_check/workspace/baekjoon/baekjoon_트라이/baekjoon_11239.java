package baekjoon_∆Æ∂Û¿Ã;
// https://www.acmicpc.net/problem/11239
// FindWords
import java.util.*;
class Trie_11239{
	Trie_11239[] list = new Trie_11239[26];
	boolean finish = false;
	void add(String s, int idx, int len) {
		if(idx == len) {
			finish = true;
			return;
		}
		int lidx = s.charAt(idx) - 'a';
		if(list[lidx] == null) list[lidx] = new Trie_11239();
		list[lidx].add(s, idx + 1, len);
	}
	int search(String s, int idx, int len) {
		if(idx == len) return finish ? 1 : 0;
		int cnt = 0;
		if(idx == 0) {
			for(int i = idx; i < len; i++) {
				int lidx = s.charAt(i) - 'a';
				if(list[lidx] != null) cnt += list[lidx].search(s, i + 1, len);
			}
		}else {
			int lidx = s.charAt(idx) - 'a', fin = finish ? 1 : 0;
			if(list[lidx] == null) return fin;
			else cnt += list[lidx].search(s, idx + 1, len) + fin;
		}
		return cnt;
	}
	
	String justone(String s, int idx, int len, int start) {
		if(idx == len || finish) return s.substring(start, idx);
		int lidx = s.charAt(idx) - 'a';
		if(list[lidx] == null) return "";
		else return list[lidx].justone(s, idx + 1, len, start);
	}
}

class TrickTrie{
	TrickTrie[] list = new TrickTrie[3];
	boolean finish = false;
	
	int[] makeArr(int i) {
		int[] arr = new int[3];
		i -= (arr[0] = i / 9) * 9;
		i -= (arr[1] = i / 3) * 3;
		arr[2] = i;
		return arr;
	}
	TrickTrie get(int i) {
		int[] arr = makeArr(i);
		TrickTrie rst = this;
		for(i = 0; i < 3; i++) {
			if(rst.list[arr[i]] == null) return null;
			rst = rst.list[arr[i]];
		}
		return rst;
	}
	void add(String s, int idx, int len) {
		if(idx == len) {
			finish = true;
			return;
		}
		int lidx = s.charAt(idx) - 'a';
		if(get(lidx) == null) {
			int[] arr = makeArr(lidx);
			TrickTrie t = this;
			for(int i = 0; i < 3; i++) {
				if(t.list[arr[i]] == null) t.list[arr[i]] = new TrickTrie();
				t = t.list[arr[i]];
			}
		}
		get(lidx).add(s, idx + 1, len);
	}
	int search(String s, int idx, int len) {
		if(idx == len) return finish ? 1 : 0;
		int cnt = 0;
		if(idx == 0) {
			for(int i = idx; i < len; i++) {
				int lidx = s.charAt(i) - 'a';
				if(get(lidx) != null) cnt += get(lidx).search(s, i + 1, len);
			}
		}else {
			int lidx = s.charAt(idx) - 'a', fin = finish ? 1 : 0;
			if(get(lidx) == null) return fin;
			else cnt += get(lidx).search(s, idx + 1, len) + fin;
		}
		return cnt;
	}
	
	String justone(String s, int idx, int len, int start) {
		if(idx == len || finish) return s.substring(start, idx);
		int lidx = s.charAt(idx) - 'a';
		if(get(lidx) == null) return "";
		else return get(lidx).justone(s, idx + 1, len, start);
	}
}
class baekjoon_11239 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			TrickTrie trie = new TrickTrie();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				String s = sc.next();
				trie.add(s, 0, s.length());
			}
			int k = sc.nextInt();
			for(int i = 0; i < k; i++) {
				String s = sc.next();
				int rst = trie.search(s, 0, s.length()), len = s.length();
				String print = rst == 0 ? "NO\n" : "AMBIGUOUS\n";
				if(rst == 1) {
					for(int j = 0; j < len; j++) {
						String test = trie.justone(s, j, len, j);
						if(!test.equals("")) {
							print = test + "\n";
							break;
						}
					}
				}
				sb.append(print);
			}
		}
		System.out.println(sb);
	}
}
