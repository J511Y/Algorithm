import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		List<Integer> bag = new ArrayList<>();
		List<int[]> jewels = new ArrayList<>();
		for(int i = 0; i < n; i++) jewels.add(new int[] { sc.nextInt(), sc.nextInt() });
		for(int i = 0; i < k; i++) bag.add(sc.nextInt());
		jewels.sort((a, b) -> a[0] - b[0]);
		bag.sort(null);
		for(int i = 0, j = 0; i < k; i++) {
			while(j < n && jewels.get(j)[0] <= bag.get(i)) pq.add(jewels.get(j++)[1]);
			if (!pq.isEmpty()) sum += pq.poll();
		}
		System.out.print(sum);
	}
}