package baekjoon_sort;
// https://www.acmicpc.net/problem/10825
// 국영수
/*
 * 문제 풀기 전 생각 2020.04.15 20:03
 * ----------------------------
 * 클래스 만들어서 Comparable 구현하면 될 듯
 */
import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
	String Name;
	int K;
	int E;
	int M;
	Student(String name, int k, int e, int m) {
		Name = name;
		K = k;
		E = e;
		M = m;
	}
	@Override
	public int compareTo(Student s) {
		int k = s.K - this.K;
		int e = this.E - s.E;
		int m = s.M - this.M;
		if(k != 0) return k;
		if(e != 0) return e;
		if(m != 0) return m;
		return this.Name.compareTo(s.Name);
	}
}
public class baekjoon_10825 {
	static int Int(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Int(br.readLine());
		List<Student> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Student s = new Student(st.nextToken(), Int(st.nextToken()), Int(st.nextToken()), Int(st.nextToken()));
			list.add(s);
		}
		list.sort(null);
		for(Student s : list) sb.append(s.Name + "\n");
		System.out.println(sb);
	}
}
