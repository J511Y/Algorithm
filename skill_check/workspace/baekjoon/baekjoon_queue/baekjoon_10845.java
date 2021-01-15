package baekjoon_queue;

import java.util.*;

// https://www.acmicpc.net/problem/10845 큐
// 큐 인터페이스를 알기 전에 짰던 소스입니당 참고해주세요
// 큐를 사용한 소스는 이 문제 말고 10866 덱 파일을 참고하시면 됩니다.
public class baekjoon_10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			switch (s) {
			case "push":
				list.add(sc.nextInt());
				break;
			case "pop":
				if (list.size() > 0) {
					System.out.println(list.get(0));
					list.remove(0);
				} else
					System.out.println(-1);
				break;
			case "size":
				System.out.println(list.size());
				break;
			case "empty":
				System.out.println(list.size() == 0 ? 1 : 0);
				break;
			case "front":
				if (list.size() > 0)
					System.out.println(list.get(0));
				else
					System.out.println(-1);
				break;
			case "back":
				if (list.size() > 0)
					System.out.println(list.get(list.size() - 1));
				else
					System.out.println(-1);
				break;
			}
		}

	}

}
