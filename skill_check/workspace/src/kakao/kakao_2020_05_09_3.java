package kakao;

import java.util.*;
/*
 * īī�� 3�� ����
 * ----------
 * �� �����ͷε� �����ؼ� ���߿� �غ��� ������
 * ������ �������� �ڵ� ��� ���� ��
 */

public class kakao_2020_05_09_3 {
	public int[] solution(String[] gems) {
    	int size = 0, min_val = 100000, idx = 0;
        int[] answer = {};
        List<int[]> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s : gems) {
            int val = map.getOrDefault(s, -1);
            if(val == -1) map.put(s, idx++);
        }
        size = map.keySet().size();
        System.out.println(size);
        if(size == 1) return new int[]{1, 1};
        if(size == gems.length) return new int[]{1, gems.length};
        int[] gem_idx = new int[size];
        Arrays.fill(gem_idx, -1);
        for(int i = 0; i < gems.length; i++){
            gem_idx[map.get(gems[i])] = i;
            int min = 987654321, max = -1;
            for(int g : gem_idx){
                min = Math.min(min, g);
                max = Math.max(max, g);
                if(g == -1) break;
            }
            System.out.println(Arrays.toString(gem_idx));
            if(min == -1) continue;
            if(min_val > (max - min)) list.add(new int[]{min, max});
        }
        list.sort((a, b) -> {
            return a[0] - b[0];
        });
        return new int[] {list.get(0)[0] + 1, list.get(0)[1] + 1};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
