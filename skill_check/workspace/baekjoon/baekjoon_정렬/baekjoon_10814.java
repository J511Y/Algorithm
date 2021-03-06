package baekjoon_����;
import java.util.*;
class BOJ {
	int age;
	String name;
	int idx;
	BOJ(int age, String name, int idx){
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
}
public class baekjoon_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = new Integer(sc.nextLine());
		List<BOJ> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split(" ");
			list.add(new BOJ(new Integer(arr[0]), arr[1], i));
		}
		list.sort((b1, b2)->{
			int cha = b1.age - b2.age;
			return cha == 0 ? b1.idx - b2.idx : cha;
		});
		for(BOJ b : list) System.out.println(b.age + " " + b.name);
	}
}
