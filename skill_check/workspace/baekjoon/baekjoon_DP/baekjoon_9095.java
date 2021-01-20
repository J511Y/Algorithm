package baekjoon_DP;
import java.util.*;
class baekjoon_9095 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,1,2,4,7,13,24,44,81,149,274};
        int t = sc.nextInt();
        while(t-->0) System.out.println(a[sc.nextInt()]);
    }
}
