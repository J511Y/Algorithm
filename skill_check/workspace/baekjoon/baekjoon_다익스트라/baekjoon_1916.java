package baekjoon_陥斥什闘虞;
// https://www.acmicpc.net/problem/1916
// 置社搾遂 姥馬奄
/*
 * 庚薦
N税 亀獣亜 赤陥. 
益軒壱 廃 亀獣拭辞 窒降馬食 陥献 亀獣拭 亀鐸馬澗 M鯵税 獄什亜 赤陥. 
酔軒澗 A腰属 亀獣拭辞 B腰属 亀獣猿走 亜澗汽 球澗 獄什 搾遂聖 置社鉢 獣徹形壱 廃陥. 
益君檎 A腰属 亀獣拭辞 B腰属 亀獣猿走 亜澗汽 球澗 置社搾遂聖 窒径馬食虞. 
亀獣税 腰硲澗 1採斗 N猿走戚陥.

脊径
湛属 匝拭 亀獣税 鯵呪 N(1 ‖ N ‖ 1,000)戚 爽嬢走壱 却属 匝拭澗 獄什税 鯵呪 M(1 ‖ M ‖ 100,000)戚 爽嬢遭陥. 
益軒壱 実属 匝採斗 M+2匝猿走 陥製引 旭精 獄什税 舛左亜 爽嬢遭陥. 
胡煽 坦製拭澗 益 獄什税 窒降 亀獣税 腰硲亜 爽嬢遭陥. 
益軒壱 益 陥製拭澗 亀鐸走税 亀獣 腰硲亜 爽嬢走壱 暁 益 獄什 搾遂戚 爽嬢遭陥. 
獄什 搾遂精 0左陥 滴暗蟹 旭壱, 100,000左陥 拙精 舛呪戚陥.

益軒壱 M+3属 匝拭澗 酔軒亜 姥馬壱切 馬澗 姥娃 窒降繊税 亀獣腰硲人 亀鐸繊税 亀獣腰硲亜 爽嬢遭陥. 
窒降繊拭辞 亀鐸繊聖 哀 呪 赤澗 井酔幻 脊径生稽 爽嬢遭陥.
 */

/*
 * 庚薦 熱奄 穿 持唖 2020.02.09 22:59
 * -----------------------------
 * 奄糎拭 熱醸揮 企稽 遭楳馬檎 吃 依 旭陥.
 * 坪球亜閃人醤臓
 * 
 * 庚薦 熱檎辞 窮 持唖 2020.02.09 23:37
 * -----------------------------
 * 焼艦びびびびびびびびびびびびびびび
 * 訊 照鞠澗汽?
 * 訊走
 * 穿粕 乞牽畏澗汽
 * 更亜庚薦走
 * 砺什闘追戚什 陥 設 蟹神澗汽
 * 焼 鯵冊帖革 遭促
 */
import java.util.*;
import java.io.*;
public class baekjoon_1916 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MAX_VALUE;
		int n = Integer.parseInt(br.readLine()) + 1, m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 1; i < n; i++) Arrays.fill(arr[i], max);
		int[] rst = new int[n], vst = new int[n];
		StringTokenizer st;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a][b] = Math.min(arr[a][b], c);
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), cnt = 1;
		vst[s] = 1;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return a[1] - b[1];}) ;
		for(int i = 1; i < n; i++) {
			if(arr[s][i] != max) {
				pq.add(new int[] {i, arr[s][i]});
			}
		}
		while(cnt < n - 1 && !pq.isEmpty()) {
			int[] tmp = pq.poll();
			int a = tmp[0], b = tmp[1];
			if(vst[a] == 0) {
				cnt++;
				vst[a] = 1;
				rst[a] = b;
				for(int i = 1; i < n; i++) {
					if(vst[i] == 0 && arr[a][i] != max) {
						b += arr[a][i];
						pq.add(new int[] {i, b});
					}
				}
			}
		}
		System.out.println(rst[e]);
	}
}
