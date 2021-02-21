package programmers;
import java.util.*;
public class prgmers_67258 {
	public int[] solution(String[] gems) {
        List<int[]> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String gem : gems) set.add(gem);
        int[] arr = new int[set.size()];
        int idx = 0, left = 0, right = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String gem : set) map.put(gem, idx++);
        arr[map.get(gems[0])]++;
        while(right < gems.length){
            boolean flag = true;
            for(int i : arr) if(i == 0){
                flag = false;
                break;
            }
            if(flag){
                list.add(new int[] {left+1, right+1});
                arr[map.get(gems[left])]--;
                left++;
            } else {
                right++;
                if(right < gems.length) arr[map.get(gems[right])]++;
            }
        }
        list.sort((a, b)-> {
            int A = a[1] - a[0];
            int B = b[1] - b[0];
            if(A == B) return a[0] - b[0];
            return A - B;
        });
        return list.get(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
