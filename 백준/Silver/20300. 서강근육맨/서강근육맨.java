import java.util.*;
class Main{
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        long rst = arr[n - 1];
        for(int i = 0, j = n / 2 * 2 - 1; i < n / 2; i++, j--) rst = Math.max(rst, arr[i] + arr[j]);
        System.out.print(rst);
    }
}