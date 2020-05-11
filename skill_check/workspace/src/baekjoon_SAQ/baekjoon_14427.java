package baekjoon_SAQ;
// https://www.acmicpc.net/problem/14427
// ¼ö¿­°ú Äõ¸® 15
import java.util.*;
import java.io.*;
public class baekjoon_14427{
    static int Int(String s){
        return Integer.parseInt(s);
    }
    public static void main(String []args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            int val = a[0] - b[0];
            return val == 0 ? (a[1] - b[1]) : val;
        });
        int n = Int(br.readLine());
        int[] arr = new int [n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Int(st.nextToken());
            pq.add(new int[]{arr[i], i});
        }
        int m = Int(br.readLine());
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int c = Int(st.nextToken());
            if(c == 1){
                int a = Int(st.nextToken()), b = Int(st.nextToken());
                arr[a] = b;
                pq.add(new int[]{b, a});
            }else{
                int[] poll = pq.poll();
                while(poll[0] != arr[poll[1]]){
                    poll = pq.poll();
                }
                pq.add(poll);
                sb.append(poll[1] + "\n");
            }
        }
        System.out.println(sb);
    }
}