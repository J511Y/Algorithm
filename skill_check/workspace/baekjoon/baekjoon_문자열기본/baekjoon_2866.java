package baekjoon_문자열기본;
import java.util.*;
public class baekjoon_2866 {
	static int charChk(byte[] b1, byte[] b2) {
		int cnt = 0;
		for(int i = 0; i < b1.length; i++) {
			if(b1[i] == b2[i]) cnt++;
			else return cnt;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		StringBuffer[] sbArr = new StringBuffer[m];
		String[] sArr = new String[m];
		for(int i = 0; i < m; i++) sbArr[i] = new StringBuffer();
		for(int i = 0; i < n; i++) {
			char[] cArr = sc.next().toCharArray();
			if(i == 0) continue;
			for(int j = 0; j < m; j++) sbArr[j].append(cArr[j]);
		}
		for(int i = 0; i < m; i++) sArr[i] = sbArr[i].reverse().toString();
		Arrays.sort(sArr);
		for(String s : sArr) System.out.println(s);
		for(int i = 0; i < m - 1; i++) {
			cnt = Math.max(cnt, charChk(sArr[i].getBytes(), sArr[i+1].getBytes()));
		}
		System.out.println(n - cnt);
	}
}
