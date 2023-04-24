import java.util.*;
class Solution {
    int isPrime(String s) {
        if(s.equals("") || s.equals("1")) return 0; // 제외조건
        long n = Long.parseLong(s); //s가 int의 범위를 넘을 수 있음
        for(int i = 2; i < (int)Math.sqrt(n) + 1; i++) { // 소수 판별
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public int solution(int n, int k) {
        String str = Integer.toString(n, k); // n을 k 진수로 변경
        int cnt = 0;
        for(String s : str.split("0")) cnt += isPrime(s); //0을 기준으로 분리하여 소수 판별
        return cnt;
    }
}