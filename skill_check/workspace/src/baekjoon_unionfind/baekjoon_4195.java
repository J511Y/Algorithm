package baekjoon_unionfind;
// https://www.acmicpc.net/problem/4195
// ģ�� ��Ʈ��ũ
/*
 * ����
�����̴� �Ҽ� ��Ʈ��ũ ����Ʈ���� ģ���� ����� ���� �����ϴ� ģ���̴�. 
��ǥ�� ������ ��̰� �ֵ���, �����̴� �Ҽ� ��Ʈ��ũ ����Ʈ���� ģ���� ������ ���� ����̴�.

� ����Ʈ�� ģ�� ���谡 ���� ������� �־����� ��, 
�� ����� ģ�� ��Ʈ��ũ�� �� ���� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ģ�� ��Ʈ��ũ�� ģ�� ���踸���� �̵��� �� �ִ� ���̸� ���Ѵ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
�� �׽�Ʈ ���̽��� ù° �ٿ��� ģ�� ������ �� F�� �־�����, �� ���� 100,000�� ���� �ʴ´�. 
���� F���� �ٿ��� ģ�� ���谡 ���� ������� �־�����. 
ģ�� ����� �� ������� ���̵�� �̷���� ������, ���ĺ� �빮�� �Ǵ� �ҹ��ڷθ� �̷���� ���� 20 ������ ���ڿ��̴�.

���
ģ�� ���谡 ���� ������, �� ����� ģ�� ��Ʈ��ũ�� �� ���� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/*
 * ���� Ǯ�� �� ���� 2020.01.19 20:40
 * -------------
 * �⺻���� ���Ͽ� ���ε� ������ ���������� �ε��� ���� �ƴ϶� Ư�� string�� �����Ƿ� map�� ��߰ڴٴ� ������ ���.
 * ģ�� ������ ���� 100,000�� ���� �ʴ´ٰ� �Ͽ����� �迭�� �˳��ϰ� 200,001�� ����. (��� ���谡 ���θ� �̾����ִ� ��� 200,000)
 * ���ο� �̸��� ������ �迭 �ε����� ����. ģ�� ���迡 ���� union-find ����.
 * �̷������� Ǯ�� ���� ������ �ʹ�.
 * 
 * ���� Ǯ�鼭 �� ���� 2020.01.19 21:00
 * -------------
 * ��ġ�°� �ݹ� ���´µ� ģ�� ���迡 ���� ī��Ʈ �ϴ� �κ��� ���� ������.
 * �����ϰ� ���������� �迭 ��� ���� ���鼭 ���� �� ��������
 * ������ �װ� �� row�� ���������� �����ؾ��ϱ� ������ �Ź� 2����� �ɸ���.
 * �� 2������� ��ġ�°� �ƴ϶� �׽�Ʈ���̽� ��ŭ �� ���ƾ��ϱ� ������ ����� �ð��� �ɸ� �� ������ ���� �� ��������.
 * ó���� ���ĸ� �����ϸ鼭 ���ŵǴ� �ֵ��� count�ϰ�, �� ������ countMap�� ������Ʈ ���ִ� �� �����ߴµ� ���� �ϴϱ� �� ���̳�.
 * 
 * ���� Ǯ�� �� �� �� ���� 2020.01.19 21:14
 * -------------
 * countMap�� ���� �η����ϴٺ��� �� ���� �� ���Ҵ�.
 * �׷��� arr�� �����ϰ� cnt��� �迭�� �������ְ�, union�� ���� �� �� ���� ������Ʈ ���־���.
 */
import java.util.*;
import java.io.*;
public class baekjoon_4195 {
	static int[] arr, cnt;
	static int union(int a, int b) {
		a = find(a);
		b = find(b);
        if(a != b) {
        	arr[a] = b;
        	cnt[b] += cnt[a];
        	cnt[a] = 1;
        }
        return cnt[b];
	}

    static int find(int x) {
        if(x == arr[x]) return x;
        return arr[x] = find(arr[x]);
    }
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine()), index = 0;
			arr = new int[200001];
			cnt = new int[200001];
			for(int j = 0; j < 200001; j++) {
				arr[j] = j;
				cnt[j] = 1;
			}
			Map<String, Integer> map = new HashMap<>();
			for(int j = 0; j < m; j++) {
				String[] input = br.readLine().split(" ");
				for(String s : input) {
					if(map.getOrDefault(s, -1) == -1) map.put(s, index++);
				}
				int a = map.get(input[0]), b = map.get(input[1]);
				bw.write(union(a, b) + "\n");
			}
		}
		bw.flush();
	}
}
