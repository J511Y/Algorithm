package baekjoon_brute_force;
// https://www.acmicpc.net/problem/14889
// 스타트와 링크
/*
 * 문제 풀기 전 생각 2020.04.02 21:34
 * ----------------------------
 * 범위가 유동적인 브루트포스.
 * 백트래킹으로 탐색하면 될 듯?
 */
import java.util.*;
import java.io.*;
public class baekjoon_14889 {
	static int n, min = Integer.MAX_VALUE;
	static int[][] stat;
	static int Int(String s) {return Integer.parseInt(s);}
	static int getStat(int bit) {
		int start = 0, link = 0, sidx = 0, lidx = 0;
		int[] sTeam = new int[n / 2], lTeam = new int[n / 2];
		for(int i = 0; i < n; i++) {
			if((bit & (1 << i)) == 0) lTeam[lidx++] = i;
			else sTeam[sidx++] = i;
		}
		for(int i = 0; i < n / 2; i++) {
			for(int j = i + 1; j < n / 2; j++) {
				start += stat[sTeam[i]][sTeam[j]] + stat[sTeam[j]][sTeam[i]];
				link += stat[lTeam[i]][lTeam[j]] + stat[lTeam[j]][lTeam[i]];
			}
		}
		return Math.abs(start - link);
	}
	static void makeTeam(int bit, int cnt, int idx) {
		if(cnt == n / 2) min = Math.min(min, getStat(bit));
		else {
			for(int i = idx; i < n; i++) {
				if((bit & (1 << i)) == 0) {
					makeTeam(bit | (1 << i), cnt + 1, i + 1);
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Int(br.readLine());
		stat = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				stat[i][j] = Int(st.nextToken());
			}
		}
		makeTeam(0, 0, 0);
		System.out.println(min);
	}
}
