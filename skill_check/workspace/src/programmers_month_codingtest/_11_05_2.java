package programmers_month_codingtest;

public class _11_05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(String s) {
        int[] answer = new int[2];
        int rnd = 0, cnt = 0;
        while(!s.equals("1")){
            rnd++;
            char[] arr = s.toCharArray();
            int tmp = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == '0') tmp++;
            }
            cnt += tmp;
            int next = arr.length - tmp;
            s = Integer.toString(next, 2);
        }
        answer[0] = rnd;
        answer[1] = cnt;
        return answer;
    }
}
