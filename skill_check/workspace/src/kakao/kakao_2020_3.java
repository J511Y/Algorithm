package kakao;
import java.util.*;
public class kakao_2020_3 {
	int count(ArrayList<Integer> list, int score){
        int left = 0, right = list.size() - 1, size = right;
        while(left <= right){
            int mid = (left + right) / 2;
            if(list.get(mid) < score) left = mid + 1;
            else right = mid - 1;
        }
        return size - right;
    }
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        ArrayList<Integer>[][][][] list = new ArrayList[3][2][2][2];
        for(String s : info) {
            String[] arr = s.split(" ");
            int a = arr[0].equals("cpp") ? 0 : arr[0].equals("java") ? 1 : 2;
            int b = arr[1].equals("backend") ? 0 : 1;
            int c = arr[2].equals("junior") ? 0 : 1;
            int d = arr[3].equals("chicken") ? 0 : 1;
            if(list[a][b][c][d] == null) list[a][b][c][d] = new ArrayList<>();
            list[a][b][c][d].add(Integer.parseInt(arr[4]));
            list[a][b][c][d].sort(null);
        }
        for(int i = 0; i < query.length; i++){
            String[] arr = query[i].replaceAll("and ", "").split(" ");
            int a = arr[0].equals("cpp") ? 0 : arr[0].equals("java") ? 1 : 2;
            int b = arr[1].equals("backend") ? 0 : 1;
            int c = arr[2].equals("junior") ? 0 : 1;
            int d = arr[3].equals("chicken") ? 0 : 1;
            
            int as = arr[0].equals("-") ? 0 : a;
            int bs = arr[1].equals("-") ? 0 : b;
            int cs = arr[2].equals("-") ? 0 : c;
            int ds = arr[3].equals("-") ? 0 : d;
            
            int count = 0, score = Integer.parseInt(arr[4]);
            for(int ta = as; ta <= a; ta++){
                for(int tb = bs; tb <= b; tb++){
                    for(int tc = cs; tc <= c; tc++){
                        for(int td = ds; td <= d; td++){
                            if(list[ta][tb][tc][td] == null) continue;
                            count += count(list[ta][tb][tc][td], score);
                        }
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
