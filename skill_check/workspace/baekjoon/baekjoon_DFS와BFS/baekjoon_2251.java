package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_2251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		boolean[][][] vst = new boolean[201][201][201];
		List<Integer> rst = new ArrayList<>();
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0, c});
		vst[0][0][c] = true;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0], y = p[1], z = p[2];
			if(x == 0) rst.add(z);
			List<int[]> list = new ArrayList<>();
			int xy = x + y > b ? b - y : x;
			int xz = x + z > c ? c - z : x;
			int yx = y + x > a ? a - x : y;
			int yz = y + z > c ? c - z : y;
			int zx = z + x > a ? a - x : z;
			int zy = z + y > b ? b - y : z;
			list.add(new int[] {x - xy, y + xy, z});
			list.add(new int[] {x - xz, y, z + xz});
			list.add(new int[] {x + yx, y - yx, z});
			list.add(new int[] {x, y - yz, z + yz});
			list.add(new int[] {x + zx, y, z - zx});
			list.add(new int[] {x, y + zy, z - zy});
			
			for(int[] arr : list) {
				if(vst[arr[0]][arr[1]][arr[2]] == false) {
					vst[arr[0]][arr[1]][arr[2]] = true;
					q.add(arr);
				}
			}
		}
		rst.sort(null);
		for(int i : rst) System.out.print(i + " ");
	}
}
