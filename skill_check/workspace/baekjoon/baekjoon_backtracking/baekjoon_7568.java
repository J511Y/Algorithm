package baekjoon_backtracking;
import java.util.*;
// ë¸Œë£¨?Š¸?¬?Š¤?¸?° ë°±íŠ¸?˜?‚¹?œ¼ë¡? ???Œ
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
        	// ?˜„?¬ ?•„ë¬´ì??„ ë¹„êµ?•˜ì§? ?•Š?•˜?œ¼?‹ˆ 1?“± ?‹œì¼œì¤Œ
            int rank = 1;
            for(int j=0; j<cnt; j++){
            	// ë°°ì—´?— ì¡´ì¬?•˜?Š” ëª¨ë‘?? ë¹„êµë¥? ?•´ë´ì•¼ ?•˜ê¸? ?•Œë¬¸ì— 0ë¶??„° ?‹œ?‘. i == j?¼ë©? ë³¸ì¸?„ ?œ»?•˜ë¯?ë¡? ?Œ¨?Š¤
                if (i == j) continue;
                // ?©ì¹˜ê? ?” ?‘?‹¤ë©? ?­?¬ë¥? ?Š˜? ¤ì¤?
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }
	}
}
