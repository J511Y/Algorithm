package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/17686?language=java
// 파일명 정렬
class File{
	String Head;
    String Number;
    String Tail;
    File(String fileName){
    	StringBuffer sb = new StringBuffer();
    	char[] arr = fileName.toCharArray();
    	int kind = 0, idx = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(kind == 0 && '0' <= arr[i] && arr[i] <= 9) {
    			this.Head = sb.substring(idx, i);
    			idx = i;
    		}
    		
    	}
    }
}
public class prgmers_17686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
