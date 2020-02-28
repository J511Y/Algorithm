import java.util.*;
class Solution{
  static int[] solution(int[] arr) {
      Set<Integer> set = new HashSet<>();
      List<Integer> list = new ArrayList<>();
      for(int i : arr) {
         if(!set.contains(i)) {
            set.add(i);
            list.add(i);
         }
      }
      return list.stream().mapToInt(s->new Integer(s)).toArray();
   }
}
public class test_1{
  public static void main(String[] ar){
    Solution s = new Solution();
    int[] arr = s.solution(new int[]{3,1,5,1,2,6,7});
    for(int i : arr) System.out.print(i+" ");
  }
}
