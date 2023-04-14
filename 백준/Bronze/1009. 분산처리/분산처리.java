import java.util.*;
class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = {
        		{10, 10, 10, 10},
                {1, 1, 1, 1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6, 4, 6},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1, 9, 1}};
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            System.out.println(arr[a % 10][(b - 1) % 4]);
        }
	}
}