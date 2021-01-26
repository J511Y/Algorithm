package baekjoon_DFS¿ÍBFS;
import java.util.*;
public class baekjoon_1260 {
	static List<Integer> dfs(int[][]arr, int v, List<Integer> list){
		if(list.size() == arr.length) return list;
		for(int i=0; i<arr.length; i++) {
			if(list.contains(i)) continue;
			if(arr[v][i] == 1) {
				list.add(i);
				return dfs(arr, i, list);
			}
		}
		return list;
	}
	
	static List<Integer> bfs(int[][]arr, int v, List<Integer> list){
		if(list.size() == arr.length) return list;
		for(int i=0; i<arr.length; i++) {
			if(list.contains(i)) continue;
			if(arr[v][i] == 1) {
				list.add(i);
				return dfs(arr, i, list);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), v = sc.nextInt();
		
		int [][] arr = new int [n+1][n+1];
		for(int i=0; i<m; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		List<Integer> dfs_list = new ArrayList<Integer>();
		dfs_list.add(v);
		dfs_list = dfs(arr, v, dfs_list);
		List<Integer> bfs_list = new ArrayList<Integer>();
		bfs_list.add(v);
		bfs_list = bfs(arr, v, bfs_list);
		
		for(int i : dfs_list) System.out.print(i+" ");
		System.out.println();
		for(int i : bfs_list) System.out.print(i+" ");
	}
}
