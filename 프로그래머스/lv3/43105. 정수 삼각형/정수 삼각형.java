import java.util.*;
class Solution {
    static int[][] val;
	public static void func(int[][] tri, int x) {
		if(x==val.length-1) return;
		for(int i=0; i<val[x].length; i++) {
			val[x+1][i] = Math.max(val[x][i] + tri[x+1][i], val[x+1][i]);
			val[x+1][i+1] = val[x][i] + tri[x+1][i+1];
		}
		func(tri, x+1);
	}
    public int solution(int[][] triangle) {
        val = new int [triangle.length][];
        for(int i=0; i<triangle.length; i++)
            val[i] = new int[triangle[i].length];
        
        val[0][0] = triangle[0][0];
        func(triangle, 0);
        return Arrays.stream(val[val.length - 1]).max().getAsInt();
    }
}