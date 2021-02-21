package programmers;
import java.util.*;
public class prgmers_17679 {
	static int M, N;
	static byte[][] arr;
    int delete(List<int[]> list){
        int cnt = 0;
        for(int[] pos : list) {
            if(arr[pos[0]][pos[1]] != '.'){
                arr[pos[0]][pos[1]] = '.';
                cnt++;
            }
        }
        for(int j = 0; j < N; j++){
            for(int i = M - 1; i >= 0; i--){
                if(arr[i][j] == '.'){
                	for(int k = i - 1; k >= 0; k--) {
                		if(arr[k][j] != '.') {
                			arr[i][j] = arr[k][j];
                			arr[k][j] = '.';
                			break;
                		}
                	}
                }
            }
        }
        return cnt;
    }
    List<int[]> blockChk(){
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < M - 1; i++){
            for(int j = 0; j < N - 1; j++){
                boolean chk1 = arr[i][j] == arr[i+1][j];
                boolean chk2 = arr[i][j] == arr[i][j+1];
                boolean chk3 = arr[i][j] == arr[i+1][j+1];
                if(arr[i][j] != '.' && chk1 && chk2 && chk3){
                    list.add(new int [] {i, j});
                    list.add(new int [] {i+1, j});
                    list.add(new int [] {i, j+1});
                    list.add(new int [] {i+1, j+1});
                }
            }
        }
        return list;
    }
    public int solution(int m, int n, String[] board) {
        M = m; N = n;
        int answer = 0;
        arr = new byte[board.length][];
        for(int i = 0; i < board.length; i++) arr[i] = board[i].getBytes();
        while(true){
            List<int[]> list = blockChk();
            if(list.size() == 0) break;
            answer += delete(list);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
