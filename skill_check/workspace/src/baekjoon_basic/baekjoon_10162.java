package baekjoon_basic;
// https://www.acmicpc.net/problem/10162
// 전자레인지
import java.util.*;
class baekjoon_10162{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h, m, s;
        h = n / 300;
        n %= 300;
        m = n / 60;
        n %= 60;
        s = n / 10;
        n %= 10;
        if(n == 0) System.out.print(h + " " + m + " " + s);
        else System.out.print(-1);
    }
}