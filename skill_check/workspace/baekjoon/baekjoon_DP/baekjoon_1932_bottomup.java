package baekjoon_DP;
import java.util.*;
class baekjoon_1932_bottomup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = new Integer(sc.nextLine());
		int[][] map = new int [n][], result = new int[n][]; // map �Է� , result ��� ���� �迭
		for(int i = 0; i < n; i++)
			map[i] =  Arrays.stream(sc.nextLine().split(" ")) // [8, 1, 0]
							.mapToInt(s->Integer.parseInt(s))
							.toArray();
		
		for(int i = 0; i < map.length - 1; i++) {
			result[i+1] = new int [map[i+1].length]; // ������ �迭 ũ�� �ʱ�ȭ
			int[] arr = map[i]; // map�� i��° �迭
			for(int j = 0; j < arr.length; j++) {
				result[i+1][j] = Math.max(result[i+1][j], arr[j] + map[i+1][j]);
				result[i+1][j+1] = Math.max(result[i+1][j+1], arr[j] + map[i+1][j+1]);
			}
			map[i+1] = result[i+1];
		}
		System.out.println(Arrays.stream(result[n-1]).max().getAsInt());
	}
}
