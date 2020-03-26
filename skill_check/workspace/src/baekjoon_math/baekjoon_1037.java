package baekjoon_math;
// https://www.acmicpc.net/problem/1037
// ¾à¼ö
import java.util.*;
class baekjoon_1037{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = new Integer(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s->Integer.parseInt(s)).sorted().toArray();
        System.out.println(arr[0] * arr[n-1]);
    }
}
