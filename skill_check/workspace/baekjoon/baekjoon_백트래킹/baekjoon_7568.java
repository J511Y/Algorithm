package baekjoon_น้ฦฎทกลท;
import java.util.*;
// ๋ธ๋ฃจ?ธ?ฌ?ค?ธ?ฐ ๋ฐฑํธ??น?ผ๋ก? ???
public class baekjoon_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int [][] arr = new int [cnt][2];
        for(int i=0; i<cnt; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        for(int i=0; i<cnt; i++){
        	// ??ฌ ?๋ฌด์?? ๋น๊ต?์ง? ???ผ? 1?ฑ ?์ผ์ค
            int rank = 1;
            for(int j=0; j<cnt; j++){
            	// ๋ฐฐ์ด? ์กด์ฌ?? ๋ชจ๋?? ๋น๊ต๋ฅ? ?ด๋ด์ผ ?๊ธ? ?๋ฌธ์ 0๋ถ??ฐ ??. i == j?ผ๋ฉ? ๋ณธ์ธ? ?ป?๋ฏ?๋ก? ?จ?ค
                if (i == j) continue;
                // ?ฉ์น๊? ? ??ค๋ฉ? ?ญ?ฌ๋ฅ? ?? ค์ค?
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }
	}
}
