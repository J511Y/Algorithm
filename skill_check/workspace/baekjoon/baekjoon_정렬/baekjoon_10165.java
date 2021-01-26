package baekjoon_Á¤·Ä;
import java.util.*;
public class baekjoon_10165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		List<int[]> arr = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(b == 0) b += n;
			arr.add(new int[] {a, b, i + 1});
			if(a > b) {
				arr.add(new int[] {a - n, b, i + 1});
				arr.add(new int[] {a, b + n, i + 1});
			}
		}
		Set<Integer> set = new HashSet<>();
		arr.sort((a, b)->{
			int rst = a[0] - b[0];
			return rst == 0 ? b[1] - a[1] : rst;
		});
		int[] last = arr.get(0);
		set.add(last[2]);
		for(int[] a : arr) {
			int la = last[0], le = last[1];
			int aa = a[0], ae = a[1], ai = a[2];
			if(la <= aa && ae <= le) continue;
			else {
				set.add(ai);
				last = a;
			}
		}
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		list.sort(null);
		for(int i : list) System.out.print(i + " ");
	}
}