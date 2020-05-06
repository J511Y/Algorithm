package baekjoon_trie;
// https://www.acmicpc.net/problem/11239
// FindWords
import java.util.*;
class Trie_11239{
	List<Trie_11239> list = new ArrayList<>();
	char c;
	boolean finish = false;
	Trie_11239(){}
	Trie_11239(char c){
		this.c = c;
	}
	
	// 위치 찾기
	int find(char c) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).c == c) return i;
		}
		return -1;
	}
	
	// 입력받은 char로 해당하는 Trie 뱉음
	Trie_11239 get(char ch) {
		int find = find(ch);
		if(find == -1) return null;
		return list.get(find);
	}
	
	// 트라이 추가
	void add(String s, int idx, int len) {
		if(idx == len) {
			finish = true;
			return;
		}
		Trie_11239 trie = get((s.charAt(idx)));
		if(trie == null) {
			list.add(new Trie_11239(s.charAt(idx)));
			trie = list.get(list.size() - 1);
		}
		trie.add(s, idx + 1, len);
	}
	
	// 입력받은 문자열이 기존 트라이에서 몇 개나 찾을 수 있는지
	int search(String s, int idx, int len) {
		if(idx == len) return finish ? 1 : 0;
		int cnt = 0;
		if(idx == 0) {
			for(int i = idx; i < len; i++) {
				Trie_11239 trie = get((s.charAt(i)));
				if(trie != null) cnt += trie.search(s, i + 1, len);
			}
		}else {
			int fin = finish ? 1 : 0;
			Trie_11239 trie = get(s.charAt(idx));
			if(trie == null) return fin;
			else cnt += trie.search(s, idx + 1, len) + fin;
		}
		return cnt;
	}
	
	// 결과가 1일 때 해당하는 문자열을 찾는 메서드
	String justone(String s, int idx, int len, int start) {
		if(idx == len || finish) return s.substring(start, idx);
		Trie_11239 trie = get((s.charAt(idx)));
		if(trie == null) return "";
		else return trie.justone(s, idx + 1, len, start);
	}
}
class baekjoon_11239 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			Trie_11239 trie = new Trie_11239();
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
