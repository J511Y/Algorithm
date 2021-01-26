package baekjoon_정렬;
// https://www.acmicpc.net/problem/2992
// 크면서 작은 수
// 정렬방법
import java.util.*;
public class baekjoon_2992_sort {
	public static void main(String[] args) {
      int x = new java.util.Scanner(System.in).nextInt();
      StringBuffer sb = new StringBuffer();
      String s = x + "";
      int len = s.length(), max = x % 10;
      List<Integer> list = new ArrayList<>();
      list.add(x % 10);
      for(int i = 2; i <= len; i++) {
         int a = s.charAt(len - i) - '0';
         list.add(a);
         if(a < max) {
            sb.append(s.substring(0, len - i));
            for(int j = 0; j < i; j++) {
               if(list.get(j) > a) {
                  sb.append(list.get(j));
                  list.remove(j);
                  break;
               }
            }
            list.sort(null);
            for(int j : list) sb.append(j);
            System.out.println(sb.toString());
            return;
         }
         max = Math.max(max, a);
      }
      System.out.println(0);
   }
}
