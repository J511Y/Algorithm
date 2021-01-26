package baekjoon_기본수학;
// https://www.acmicpc.net/problem/1037
// 약수
import java.util.*;
class baekjoon_1037{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = new Integer(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s->Integer.parseInt(s)).sorted().toArray();
        System.out.println(arr[0] * arr[n-1]);
    }
}
