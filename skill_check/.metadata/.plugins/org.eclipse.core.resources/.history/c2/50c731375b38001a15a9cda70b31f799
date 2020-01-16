package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/5430 AC
// 뒤집혔을 경우 출력 역시 뒤집힌 채로 출력해야 합니다.
public class baekjoon_5430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int a = 0; a < T; a++) {
			String pattern = sc.next(); sc.next();
			boolean front = true;
			Deque<Integer> dq = new LinkedList<>();
			String[] arr = sc.next().replace("[", "").replace("]", "").split(",");
			for(String s : arr) {
				if(s.equals("")) break;
				dq.addLast(Integer.parseInt(s));
			}
			
			for(byte b : pattern.getBytes()) {
				if(b == 'R') {
					front = !front;
				}else if(b == 'D') {
					if(dq.isEmpty()) {
						dq = null;
						break;
					}else {
						if(front) dq.pollFirst();
						else dq.pollLast();
					}
				}
			}
			if(dq == null) System.out.println("error");
			else {
				StringBuffer sb = new StringBuffer();
				sb.append("[");
				while(!dq.isEmpty()) {
					sb.append(front ? dq.pollFirst() : dq.pollLast());
					sb.append((dq.size() == 0 ? "" : ","));
				}
				sb.append("]");
				System.out.println(sb.toString());
			}
		}
	}
}
