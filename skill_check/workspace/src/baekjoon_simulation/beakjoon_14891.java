import java.util.*;
class beakjoon_14891{
	static int getDis(int i) {
		return i < 0 ? (8 + i) : i > 7 ? (i - 8) : i; 
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		byte[][] cogs = new byte[4][];
		int[] spin = {0, 0, 0, 0}, pm = new int[4];
		for(int i = 0; i < 4; i++) cogs[i] = sc.next().getBytes();
		int n = sc.nextInt(), sum = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt() - 1, plus = sc.nextInt() * -1;
			pm[x] = plus;
			for(int j = 1; j < 4; j++) {
				int a = x - j, b = x + j;
				if(a >= 0) pm[a] = pm[a+1] * (cogs[a][getDis(spin[a]+2)] == cogs[a+1][getDis(spin[a+1]-2)] ? 0 : -1);
				if(b < 4) pm[b] = pm[b-1] * (cogs[b][getDis(spin[b]-2)] == cogs[b-1][getDis(spin[b-1]+2)] ? 0 : -1);
			}
			for(int j = 0; j < 4; j++) spin[j] = getDis(spin[j] + pm[j]);
		}
		for(int i = 0 ; i < 4; i++) sum += cogs[i][spin[i]] == '1' ? (1 << i) : 0;
		System.out.println(sum);
	}
}
