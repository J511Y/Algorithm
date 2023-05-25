class Solution {
    int one = 0, zero = 0;
    void press(int[][] arr, int xs, int xe, int ys, int ye){
        int oneCnt = 0, max = (int)Math.pow(xe - xs, 2);
        for(int i = xs; i < xe; i++){
            for(int j = ys; j < ye; j++){
                oneCnt += arr[i][j];
            }
        }
        if(oneCnt == 0) zero++;
        else if(oneCnt == max) one++;
        else {
            int xm = (xe + xs) / 2;
            int ym = (ye + ys) / 2;
            press(arr, xs, xm, ys, ym);
            press(arr, xm, xe, ys, ym);
            press(arr, xs, xm, ym, ye);
            press(arr, xm, xe, ym, ye);
        }
    }
    public int[] solution(int[][] arr) {
        press(arr, 0, arr.length, 0, arr.length);
        return new int[]{zero, one};
    }
}