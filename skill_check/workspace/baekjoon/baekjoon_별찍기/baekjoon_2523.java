package baekjoon_�����;
// https://www.acmicpc.net/problem/2523
// �� ��� - 13
public class baekjoon_2523 {
	public static void main(String[] ar){
        int n = new java.util.Scanner(System.in).nextInt();
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i < n * 2; i++){
            for(int j = 1; j <= (i > n ? n - (i % n) : i); j++) sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
