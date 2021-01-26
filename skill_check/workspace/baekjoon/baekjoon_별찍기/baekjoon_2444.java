package baekjoon_º°Âï±â;
import java.io.*;
class Main{
    public static void main(String[] ar) throws Exception{
        int n = new java.util.Scanner(System.in).nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i < n * 2; i++){
            int abs = Math.abs(n - i);
            bw.write(" ".repeat(abs) + "*".repeat((n - abs) * 2 - 1) + "\n");
        }
        bw.flush();
    }
}
