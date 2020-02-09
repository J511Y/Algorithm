package crossent_test;
import java.util.*;

public class crossent_quiz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		StringBuffer output = new StringBuffer();
		String input = sc.nextLine();
		String[] split = input.split("^[[a-z*]]&");
		for(String s : split) System.out.println(s);
	}
}
