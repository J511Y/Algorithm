package baekjoon_backtracking;
import java.util.*;
// 브루?��?��?��?��?�� 백트?��?��?���? ???��
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
        	// ?��?�� ?��무�??�� 비교?���? ?��?��?��?�� 1?�� ?��켜줌
            int rank = 1;
            for(int j=0; j<cnt; j++){
            	// 배열?�� 존재?��?�� 모두?? 비교�? ?��봐야 ?���? ?��문에 0�??�� ?��?��. i == j?���? 본인?�� ?��?���?�? ?��?��
                if (i == j) continue;
                // ?��치�? ?�� ?��?���? ?��?���? ?��?���?
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }
	}
}
