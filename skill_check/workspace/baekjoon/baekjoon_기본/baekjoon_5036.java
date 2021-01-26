package baekjoon_±âº»;
// https://www.acmicpc.net/problem/5063
// TGN
import java.util.*;
public class baekjoon_5036 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String[] answer = {"do not advertise", "does not matter", "advertise"};
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int r = sc.nextInt(), ec = sc.nextInt() - sc.nextInt(), rst = 1;
			if(r < ec) rst++;
			if(r > ec) rst--;
			System.out.println(answer[rst]);
		}
	}
}
