package programmers;

public class prgmers_1835 {
	String[] f = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"}, data;
    boolean[] vst = new boolean[8];
    int answer = 0;
    void DFS(String s, int idx){
        if(idx == 8){
            answer += Check(s) ? 1 : 0;
            return;
        }
        for(int i = 0; i < 8; i++){
            if(vst[i] == false) {
                vst[i] = true;
                DFS(s + f[i], idx + 1);
                vst[i] = false;
            }
        }
    }
    boolean Check(String s){
        
        for(String d : data){
            char a = d.charAt(0), b = d.charAt(2), c = d.charAt(3);
            int x = d.charAt(4) - '0';
            int cha = Math.abs(s.indexOf(a) - s.indexOf(b)) - 1;
            
            if(c == '>' && cha <= x) return false;
            if(c == '=' && cha != x) return false;
            if(c == '<' && cha >= x) return false;
        }
        return true;
    }
    public int solution(int n, String[] data) {
        this.data = data;
        DFS("", 0);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
