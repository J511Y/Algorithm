package baekjoon_기본수학;
// https://www.acmicpc.net/problem/18291
// 징검다리 건너기
import java.util.*;
class baekjoon_18291{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mod = 1000000007;
        for(int tc = 0; tc < n; tc++){
            long x = sc.nextLong() - 2, val = 1, two = 2;
            while(x > 0){
                if(x % 2 == 1) val = (val * two) % mod;
        		x /= 2;
        		two = (two * two) % mod;
            }
            System.out.println(val);
        }
    }
}