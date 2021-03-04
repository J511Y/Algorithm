package baekjoon_투포인터;
import java.util.*;
class baekjoon_20922 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), k = sc.nextInt();
	    int[] arr = new int[n], cnt = new int[100001];
	    for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
	    int l = 0, r = 0, max = 1;
	    cnt[arr[r]]++;
	    while(r < n) {
	        if(cnt[arr[r]] > k) {
	            max = Math.max(max, r - l);
	            cnt[arr[l]]--;
	            l++;
	        } else {
	            r++;
	            if(r < n) cnt[arr[r]]++;
	            else max = Math.max(max, r - l);
	        }
	    }
	    System.out.print(max);
	}
}