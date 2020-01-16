package baekjoon_brute_force;
import java.util.*;
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
        	// 현재 아무와도 비교하지 않았으니 1등 시켜줌
            int rank = 1;
            for(int j=0; j<cnt; j++){
            	// 배열에 존재하는 모두와 비교를 해봐야 하기 때문에 0부터 시작. i == j라면 본인을 뜻하므로 패스
                if (i == j) continue;
                // 덩치가 더 작다면 랭크를 늘려줌
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }
	}
}
