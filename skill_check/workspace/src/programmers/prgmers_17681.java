package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/17682
// 다트 게임
public class prgmers_17681 {
	public int solution(String dartResult) {
	      int answer = 0, idx = -1, point = 0;
	      int[] points = new int[3];
	      byte[] bytes = dartResult.getBytes();
	      for(int i = 0; i < bytes.length; i++){
	          byte b = bytes[i];
	          if('0' <= b && b <= '9') {
	              idx++;
	              if(b == '1' && bytes[i + 1] == '0') {
	                  point = 10;
	                  i++;
	                  continue;
	              }
	              point = b - '0';
	          }else{
	              if(points[idx] == 0) points[idx] = point;
	              if(b == 'D') points[idx] *= points[idx];
	              if(b == 'T') points[idx] *= points[idx] * points[idx];
	              if(b == '*') {
	                  points[idx] *= 2;
	                  if(idx != 0) points[idx - 1] *= 2;
	              }
	              if(b == '#') points[idx] *= -1;
	          }
	      }
	      return points[0] + points[1] + points[2];
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
