package programmers;
import java.util.*;
class prgmers_17676 {
    int Int(String s) {
        return Integer.parseInt(s);
    }
    int TimeToInt(String s) {
        int time = 0;
        String[] fulltime = s.split("[.]");
        String[] hms = fulltime[0].split(":");
        time += Int(hms[0]) * 60 * 60 * 1000;
        time += Int(hms[1]) * 60 * 1000;
        time += Int(hms[2]) * 1000;
        time += Int(fulltime[1]);
        return time;
    }
    public int solution(String[] lines) {
        int n = lines.length, max = 0;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            String[] log = lines[i].split(" ");
            double processTime = Double.parseDouble(log[2].replace("s", "")) * 1000;
            int endTime = TimeToInt(log[1]);
            int startTime = endTime - (int)processTime + 1;
            arr[i][0] = startTime;
            arr[i][1] = endTime;
        }
        Arrays.sort(arr, (a, b) -> {
            int s = a[0] - b[0];
            int e = a[1] - b[1];
            return s == 0 ? e : s;
        });
        
        for(int i = 0; i < n; i++) {
            int is = arr[i][0], ie = arr[i][1];
            int js = 0, je = 0, jscnt = 0, jecnt= 0;
            while(js < n) {
                if (arr[js][0] >= is + 1000) break;
                if (arr[js][1] >= is) jscnt++;
                js++;
            }
            while(je < n) {
                if (arr[je][0] >= ie + 1000) break;
                if (arr[je][1] >= ie) jecnt++;
                je++;
            }
            max = Math.max(max, jscnt);
            max = Math.max(max, jecnt);
        }
        return max;
    }
}