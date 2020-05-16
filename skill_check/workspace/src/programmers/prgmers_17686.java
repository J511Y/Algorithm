package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/17686?language=java
// 파일명 정렬
import java.util.*;
class File implements Comparable<File>{
	String Head;
    String Number;
    String Tail;
    File(String fileName){
    	char[] arr = fileName.toCharArray();
    	int idx = 0, i = 0;
    	for(; i < arr.length; i++) {
    		if(isNum(arr[i])) {
    			this.Head = fileName.substring(idx, i);
    			idx = i;
    			break;
    		}
    	}
    	for(int cnt = 0; i < arr.length && cnt < 5; i++, cnt++) {
    		if(!isNum(arr[i])) {
    			break;
    		}
    	}
    	Number = fileName.substring(idx, i);
    	if(i < arr.length - 1) Tail = fileName.substring(i);
    }
    boolean isNum(char c) {
    	return '0' <= c && c <= '9';
    }
	@Override
	public int compareTo(File f) {
		int h = this.Head.toLowerCase().compareTo(f.Head.toLowerCase());
		int n = Integer.parseInt(this.Number) - Integer.parseInt(f.Number);
		if(h != 0) return h;
		return n;
	}
	public String toString() {
		return Head + Number + (Tail != null ? Tail : "");
	}
}
public class prgmers_17686 {
	static public String[] solution(String[] files) {
        File[] file = new File[files.length];
        for(int i = 0; i < files.length; i++) {
        	file[i] = new File(files[i]);
        }
        Arrays.sort(file);
        for(int i = 0; i < files.length; i++) {
        	files[i] = file[i].toString();
        }
        return files;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {
				"img1.png"
				, "IMG01.GIF"
				, "img02.png"
				, "img2.JPG"
				, "img10.png"
				, "img12.png"
		})));

	}

}
