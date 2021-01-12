import java.util.*;
class baekjoon_2505 {
	static List<int[]> list = new ArrayList<>();
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n], tmp = new int[n];
		for(int i = 0; i < n; i++) tmp[i] = arr[i] = sc.nextInt();
		find(arr, 0, n, 1);
		if(list.size() > 2) {
			list = new ArrayList<>();
			find(tmp, n - 1, -1, -1);
		}
		for(int[] a : list) System.out.println(a[0] + " " + a[1]);
		for(int i = list.size(); i < 2; i++) System.out.println("1 1");
	}
	static void find(int[] arr, int s, int e, int p) {
		for(int i = s; i != e; i += p) {
			if(arr[i] != i + 1) {
				for(int j = i + p; j != e; j += p) {
					if(arr[j] == i + 1) {
						int min = Math.min(i, j), max = Math.max(i, j);
						flip(arr, min, max);
						list.add(new int[] {min + 1, max + 1});
						break;
					}
				}
			}
		}
	}
	static void flip(int[] arr, int i, int j) {
		for(int a = 0; i + a < j - a; a++) {
			int tmp = arr[i + a];
			arr[i + a] = arr[j - a];
			arr[j - a] = tmp;
		}
	}
}