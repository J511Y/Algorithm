package dFS_BFS;
import java.util.*;
public class baekjoon_2178 {
	static int x,y;
	static int [] dx = {1,0,-1,0}; // �����ʺ��� �ð�������� Ȯ��
	static int [] dy = {0,1,0,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt(); y=sc.nextInt();
		int [][] map = new int [x][y]; // ������ �׷��� �������迭
		boolean [][] visit = new boolean [x][y]; // �湮 ���θ� Ȯ������ ������ boolean �迭
		for(int i=0; i<x; i++) {
			byte[] arr = sc.next().getBytes(); //�ƴ� ��ҿ� �������� ������� �ִ��� �� �̹��� �� �ٿ����ش��?
			for(int j=0; j<y; j++) {
				map[i][j] = arr[j]-'0';
			}
		}
		Queue<int[]> que = new LinkedList<int[]>(); // BFS�� ������� queue ����. �� �׳� �迭�� ���ҷ� ���� ����
		que.add(new int [] {0,0}); // �⺻�� �־��ְ�
		while(!que.isEmpty()) { // que �� ���� �ִٸ� ��� ����.
			int [] idx = que.poll();
			int a = idx[0], b = idx[1]; // ť�� �� �տ� �ִ� �迭 ������ ��ǥ�� ����.
			visit[a][b] = true; // �湮���θ� true�� �������.
//			System.out.println(a+","+b);
			for(int i=0; i<4; i++) {
				int nx = a+dx[i], ny = b+dy[i];
				if(nx == x-1 && ny == y-1) { // �� ���� �����ߴٸ� ����ϰ� ����
					System.out.println(map[a][b] + 1);
					return;
				}
				if(0<=nx && nx<x && 0<=ny && ny<y) { //������ ����� �� Ȯ��
					if(!visit[nx][ny] && map[nx][ny] == 1) {// �湮������ ����, map���� �� �� �ִ� ����� ���
						map[nx][ny] = map[a][b] + 1; // �ش� ����� ���� ���� ����� �� + 1 ���� 
						que.add(new int [] {nx,ny}); // ť�� ��θ� ����־ �ٽ� Ž���� �� �ֵ��� ����.
					}
				}
			}
		}
		/* Ȯ���� ���� ��¹�
		System.out.println(que.size());
		for(int [] ar : map) {
			for(int i : ar) System.out.print(i);
			System.out.println();
		}
		System.out.println("--------------------");
		for(boolean [] bool : visit) {
			for(boolean b : bool) {
				System.out.print(b?1:0);
			}
			System.out.println();
		}
		*/
	}
}
