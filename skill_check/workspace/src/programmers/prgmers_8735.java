package programmers;

public class prgmers_8735 {
	public long solution(int w,int h) {
        long W = (long)w, H = (long)h;
        long answer = W * H;
        long remove = 0;

        long gcd = gcd(W,H);
        long smallw = W / gcd, smallh = H / gcd;
        float start = 0, end = 0;
        float x = (float)smallh / (float)smallw;
        for(long i = 1; i <= smallw; i++) {
            start = end;
            end += x;
            remove += Math.ceil(end)-Math.floor(start);
        }
        remove *= gcd;
        return answer-remove;
    }
	
	public static long gcd(long a,long b) {
        long tmp=0;
        while(b>0) {
            tmp=a;
            a=b;
            b=tmp%b;
        }
        return a;
    }
	public static void main(String[] args) {
		System.out.println(gcd(100000000, 99999999));
		System.out.println(100000000l * 100000000l);
		
	}

}
