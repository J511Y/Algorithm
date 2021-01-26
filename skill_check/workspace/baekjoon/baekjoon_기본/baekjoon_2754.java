package baekjoon_기본;
// https://www.acmicpc.net/problem/2754
// 학점계싼
public class baekjoon_2754 {
	public static void main(String[] ar) {
		byte[] input = new java.util.Scanner(System.in).next().getBytes();
		String[][] arr = {{"4.3", "4.0", "3.7"}, {"3.3", "3.0", "2.7"}, {"2.3", "2.0", "1.7"}, {"1.3", "1.0", "0.7"}};
		if(input[0] == 'F') System.out.println("0.0");
		else System.out.println(arr[input[0] - 'A'][input[1] == '+' ? 0 : input[1] == '0' ? 1 : 2]);
	}
}
