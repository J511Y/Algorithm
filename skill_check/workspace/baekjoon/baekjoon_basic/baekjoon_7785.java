package baekjoon_basic;
import java.util.*;
import java.io.*;
public class baekjoon_7785 {
	public static void main(String[] args) throws Exception{
		// 입력을 받아줄 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n개의 입력이 들어옴
		int n = Integer.parseInt(br.readLine());
		
		// 근무 상태를 저장해줄 Set
		Set<String> set = new HashSet<>();
		
		// n번의 입력
		for(int i = 0; i < n; i++) {
			// input[0] = 이름, input[1] = 출퇴근 상태
			String[] input = br.readLine().split(" ");
			if(input[1].equals("enter")) set.add(input[0]);
			else set.remove(input[0]);
		}
		
		// 위의 Set을 index를 갖도록 해줄 list (정렬을 위해)
		List<String> list = new ArrayList<>();
		
		// list에 set을 넣어줌
		list.addAll(set);
		
		// 정렬 (람다)
		list.sort((a, b)->{return b.compareTo(a);});
		
		// list가 가진 모든 String을 차례로 방문하는 개선된 for문
		for(String s : list) System.out.println(s);
	}
}
