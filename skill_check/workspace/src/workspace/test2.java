package workspace;
import java.util.*;
public class test2 {
	private static String A = "";
	private String B = "";
	
	public test2() {
		A+="A";
		B+="A";
	}
	static {
		A += "B";
	}
	{
		A+= "C";
		B+= "C";
	}
	public static void main(String [] args) {
		System.out.println(A);
		test2 t = new test2();
		t.append("D");
		System.out.println(A);
		System.out.println(t.B);
		System.out.println(isTrue());
	}
	private void append(String string) {
		A += string;
		B += string;
	}
	private static boolean isTrue() {
		try {
			return false;
		}catch(Exception e) {
			
		}finally {
			System.out.println("finally구문 실행");
		}
		return true;
	}
}
